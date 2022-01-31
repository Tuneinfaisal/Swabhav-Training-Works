import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImagesThumbnailComponent } from './images-thumbnail.component';

describe('ImagesThumbnailComponent', () => {
  let component: ImagesThumbnailComponent;
  let fixture: ComponentFixture<ImagesThumbnailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImagesThumbnailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImagesThumbnailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
