package controller;

import model.Usuario;

public class controladorInicio {
    
    Usuario[] usuarios = new Usuario[5];
    public controladorInicio(){
        usuarios[0] = new Usuario("user1@gmail.com", "12345");
        usuarios[1] = new Usuario("user2@gmail.com", "12345");
        usuarios[2] = new Usuario("user3@gmail.com", "12345");
        usuarios[3] = new Usuario("user4@gmail.com", "12345");
        usuarios[4] = new Usuario("user5@gmail.com", "12345");
    }
    
    public boolean ingresar(String usuario, String contra){
        for (int i = 0; i < 5; i++){
            if (usuarios[i].getUsuario().equals(usuario) && usuarios[i].getContra().equals(contra))
            return true;
        }
        return false;
//        return true;
    }
}
