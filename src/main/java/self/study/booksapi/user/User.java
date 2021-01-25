package self.study.booksapi.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class User implements UserDetails {
    private String username;
    private String password;
    private boolean is_active;

    public User(String username, String password, boolean is_active) {
        this.username = username;
        this.password = password;
        this.is_active = is_active;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return is_active;
    }

    @Override
    public boolean isAccountNonLocked() {
        return is_active;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return is_active;
    }

    @Override
    public boolean isEnabled() {
        return is_active;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
