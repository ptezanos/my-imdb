import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationButtonComponent } from '../../navigation-button/navigation-button.component';
import { Movie, Person } from '../../../models';
import { ActivatedRoute, Router } from '@angular/router';
import { PersonService } from '../../../services/person.service';

@Component({
  selector: 'app-selected-person',
  standalone: true,
  imports: [CommonModule, NavigationButtonComponent],
  templateUrl: './selected-person.component.html',
  styleUrl: './selected-person.component.css'
})
export class SelectedPersonComponent implements OnInit {

  moviesTitle: string = "BACK TO MOVIES";
  moviesPageName: string = "movies";

  selectedPersonId!: number;
  selectedPerson!: Person;

  movies!: Movie[];

  constructor(private route: ActivatedRoute, private router: Router, private personService: PersonService) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.selectedPersonId = params['personId'];
    });

    this.personService.getPerson(this.selectedPersonId).subscribe(person => {
      this.selectedPerson = person;
      this.movies = person.movies!;
    });
  }

  goToSelectedMovie(movieId: number): void {
    this.router.navigate(['/movies', movieId]);
  }

}
