import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationButtonComponent } from '../../navigation-button/navigation-button.component';
import { ActivatedRoute, Router } from '@angular/router';
import { MovieService } from '../../../services/movie.service';
import { Movie, Person } from '../../../models';

@Component({
  selector: 'app-selected-movie',
  standalone: true,
  imports: [CommonModule, NavigationButtonComponent],
  templateUrl: './selected-movie.component.html',
  styleUrl: './selected-movie.component.css'
})
export class SelectedMovieComponent implements OnInit {

  moviesTitle: string = "BACK TO MOVIES";
  moviesPageName: string = "movies";


  selectedMovieId!: number;
  selectedMovie!: Movie;

  cast!: Person[];

  constructor(private route: ActivatedRoute, private router: Router, private movieService: MovieService) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.selectedMovieId = params['movieId'];
    });

    this.movieService.getMovie(this.selectedMovieId).subscribe(movie => {
      this.selectedMovie = movie;
      this.cast = movie.cast!;
    });
  }

  goToSelectedPerson(personId: number): void {
    this.router.navigate(['/persons', personId]);
  }

}
