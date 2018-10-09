import { TestBed } from '@angular/core/testing';

import { ProductAvailabilityService } from './product-availability.service';

describe('ProductAvailabilityService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductAvailabilityService = TestBed.get(ProductAvailabilityService);
    expect(service).toBeTruthy();
  });
});
