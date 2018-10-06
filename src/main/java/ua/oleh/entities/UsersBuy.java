package ua.oleh.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_buy", schema = "web_task", catalog = "")
public class UsersBuy {
    private Integer id;
    private Double usersBuysum;
    private String username;
    private Timestamp date;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Users_buysum")
    public Double getUsersBuysum() {
        return usersBuysum;
    }

    public void setUsersBuysum(Double usersBuysum) {
        this.usersBuysum = usersBuysum;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersBuy usersBuy = (UsersBuy) o;

        if (id != null ? !id.equals(usersBuy.id) : usersBuy.id != null) return false;
        if (usersBuysum != null ? !usersBuysum.equals(usersBuy.usersBuysum) : usersBuy.usersBuysum != null)
            return false;
        if (username != null ? !username.equals(usersBuy.username) : usersBuy.username != null) return false;
        if (date != null ? !date.equals(usersBuy.date) : usersBuy.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (usersBuysum != null ? usersBuysum.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
