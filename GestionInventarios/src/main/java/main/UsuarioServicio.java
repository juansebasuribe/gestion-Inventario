package main;

public class UsuarioServicio {
    
    private final UsuarioRepositorio usuarioRepositorio;
    
    //inicializamos constructor
    public UsuarioServicio(){
        this.usuarioRepositorio = new UsuarioRepositorio();
    }
    
    public boolean validarUsuario(String correo, String Contraseña){
        
        Usuario usuario = usuarioRepositorio.obtenerUsuarioPorCorreo(correo);
        return usuario != null  && usuario.getContrasena().equals(Contraseña);
    }
   
}
