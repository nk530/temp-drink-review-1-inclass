package ca.sheridancollege.nevishku.drinkreview1.respositories;

import ca.sheridancollege.nevishku.drinkreview1.bean.Drink;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import  lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@AllArgsConstructor

public class DrinkRepository {


    private NamedParameterJdbcTemplate jdbc;

    public ArrayList<Drink> getDrinks() {
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        String query = "SELECT * FROM easy_drinks";
        ArrayList<Drink> drinks = (ArrayList<Drink>) jdbc.query(query, parameters, new BeanPropertyRowMapper<Drink>(Drink.class));

        return drinks;
}
}