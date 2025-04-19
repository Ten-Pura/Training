import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/", "/login", "/signup").permitAll() //ルートは誰でもアクセス可能
                .anyRequest().authenticated()     //他は認証が必要
            )
            .formLogin(); //デフォルトのロフインフォームを使用

        return http.build();
    }
}