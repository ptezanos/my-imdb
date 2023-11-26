import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Movie } from '../models';
import { Observable } from 'rxjs';

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

    getMovie(id: string): Observable<Movie> {
      return this.http.get<Movie>(
        `http://localhost:8085/movies/?id=${id}`
      );
    }
  
}
