import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelectedPersonComponent } from './selected-person.component';

describe('SelectedPersonComponent', () => {
  let component: SelectedPersonComponent;
  let fixture: ComponentFixture<SelectedPersonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SelectedPersonComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SelectedPersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
