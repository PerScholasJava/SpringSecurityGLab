package org.perscholas.glab.securityglab.services;

import org.perscholas.glab.securityglab.dto.UserDTO;
import org.perscholas.glab.securityglab.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String userName);
    public void creat(UserDTO userDTO);
    public User findUserByEmail(String email);
    public User findUserByName(String name);
}
