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
    
    let processCheckout = ProcessCheckout(repository: BookRepository())
    
    let getAll = GetAll(repository: BookRepository())
    
    
    func checkout() {
        let books = getAll.invoke()
        let currentBook = books.first
        
        //processCheckout.invoke(book: currentBook)
    }
}
