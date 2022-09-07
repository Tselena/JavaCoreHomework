package HomeWorkTwo;

public class Checker {

    private String[][] array;

    public void checkArray(String[][] myArray) {
        try {
            checkArraySize(myArray);
            this.array = myArray;
        } catch (MyArraySizeExeption e){
            e.printStackTrace();
        } catch (NullPointerException no) {
            System.out.println("� ���������� ������� ����������� ������");
            no.printStackTrace();
        }
    }


    private void checkArraySize(String[][] myArray) throws MyArraySizeExeption {
        if (checkArrayLength(myArray)) {
            throw new MyArraySizeExeption("������! ����������� ������� �� ������������� ������� 4 � 4");
        }
    }

    private boolean checkArrayLength(String[][] myArray) {
        for (String [] str: myArray){
            if (str.length != 4) {
                return true;
            }
        }
        return false;
    }

    public void summizeData() {
        if (array == null) {
            System.out.println("��������� ������. � ������� ������� ����������� ��������");
        }

        try {
            summizeArrayData();
        } catch (MyArrayDataExeption e) {
                    e.printStackTrace();
        }
    }


    private void summizeArrayData() throws MyArrayDataExeption{
        int total=0;
        for(int i=0;i<array.length;i++){
            String[]row = array[i];
            for(int j=0;j<row.length;j++){
                try {
                    total+=Integer.parseInt(row[j]);
                } catch(NumberFormatException e) {
                    throw new MyArrayDataExeption("� ������� ���� �� ������ �����. ����������� ������. ��������� ������: "+i+":"+j);
                }
            }
        }
        System.out.println("����� ���� ��������� ������� ����� " + total);
    }

}
