class Faculty {
    List<Student> list=new List<Student>();
    String imeNafaks;

    public int averageGrade() {
        int gradesCount = 0;
        Node<Integer> tmp = list.first();
        while(node != null) {
            tmp = node.next;
            gradesCount += node.grade;
        }
        return gradesCount / getNumOfStudents();
    }

    public int getNumOfStudents() {
        int count = 0;
        Node<Integer> tmp = list.first();
        while(node != null) {
            tmp = node.next;
            count ++;
        }
        return count;
    }
}

