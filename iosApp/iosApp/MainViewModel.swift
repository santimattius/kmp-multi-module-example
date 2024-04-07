//
//  MainViewModel.swift
//  iosApp
//
//  Created by Santiago Mattiauda on 7/4/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

class MainViewModel {
    
    private let bookRepository: BookRepository
    private let processCheckout: ProcessCheckout
    private let getAll: GetAll
    
    init() {
        self.bookRepository = BookRepository()
        self.processCheckout = ProcessCheckout(repository: bookRepository)
        self.getAll = GetAll(repository: bookRepository)
    }
    
    func checkout() {
        let books = getAll.invoke()
        guard let currentBook = books.first else {
            return
        }
        
        processCheckout.invoke(book: currentBook)
    }
}
