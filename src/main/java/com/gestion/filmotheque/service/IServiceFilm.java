package com.gestion.filmotheque.service;





import com.gestion.filmotheque.entities.Film;

import java.util.List;

public interface IServiceFilm {
    public Film createFilm(Film film);
    public Film findFilmById(int id);
    public List<Film> findAllFilms();
    public Film updateFilm (Film film);
    public void deleteFilm(int id);
}
