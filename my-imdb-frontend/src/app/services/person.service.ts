import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from '../models';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor(private http: HttpClient) {}

    getPersons(): Observable<Person[]> {
      return this.http.get<Person[]>(
        `http://localhost:8085/persons`
      );
    }

    getPerson(personId: number): Observable<Person> {
      return this.http.get<Person>(
        `http://localhost:8085/persons/${personId}`
      );
    }
}
