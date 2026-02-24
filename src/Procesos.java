public class Procesos {
    
    private final String USUARIO="CARLOS",CONTRA="123";
    public boolean verificarUsuario(String user){
        if (user.equalsIgnoreCase(USUARIO)){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarPassword(String pass){
        if (pass.equalsIgnoreCase(CONTRA)){
            return true;
        }else{
            return false;
        }
    }
}
