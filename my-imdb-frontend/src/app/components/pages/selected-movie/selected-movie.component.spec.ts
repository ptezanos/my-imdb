import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelectedMovieComponent } from './selected-movie.component';

describe('SelectedMovieComponent', () => {
  let component: SelectedMovieComponent;
  let fixture: ComponentFixture<SelectedMovieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SelectedMovieComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SelectedMovieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
