import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie, UserRating } from '../models';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private http: HttpClient) {}

    getMovies(): Observable<Movie[]> {
      return this.http.get<Movie[]>(
        `http://localhost:8085/movies`
      );
    }

    getMovie(movieId: number): Observable<Movie> {
      return this.http.get<Movie>(
        `http://localhost:8085/movies/${movieId}`
      );
    }

    rateMovie(movieId: number, userRating: UserRating): Observable<number> {
      return this.http.post<number>(
        `http://localhost:8085/movies/${movieId}`, userRating
      );
    }
  
}
