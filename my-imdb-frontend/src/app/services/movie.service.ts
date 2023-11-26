import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Movies } from '../models';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private http: HttpClient) {}

    getMovies(): Observable<Movies> {
      return this.http.get<Movies>(
        `http://localhost:8085/movies`
      );
    }

  
}
