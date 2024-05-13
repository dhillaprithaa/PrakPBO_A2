public class MainDAO {
    public static void main (String args[]){
        Person person = new Person("Kaifano");
        DAOManager m = new DAOManager();
        m.setPersonDAO (new MYSQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}

