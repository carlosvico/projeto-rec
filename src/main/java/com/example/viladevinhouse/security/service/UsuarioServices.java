package com.example.viladevinhouse.security.service;

import com.example.viladevinhouse.security.model.Role;
import com.example.viladevinhouse.security.model.RoleTipo;
import com.example.viladevinhouse.security.model.Usuario;
import com.example.viladevinhouse.security.repository.UsuarioRepository;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServices implements UserDetailsService {
    final UsuarioRepository repository;

    public UsuarioServices(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Usuario buscaPeloEmail(String email){
        return repository.findByEmailUsuario(email);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = buscaPeloEmail(username);
        return new User(
                usuario.getEmailUsuario(),
                usuario.getSenha(),
                AuthorityUtils.createAuthorityList(getAuthorities((List<Role>) usuario.getRole()))
        );
    }

    private String[] getAuthorities(List<Role> tipos){
        String[] authorities = new String[tipos.size()];
        for (int i = 0; i < tipos.size(); i++){
            authorities[i] = tipos.get(i).getDesc();
        }
        return authorities;
    }
}
