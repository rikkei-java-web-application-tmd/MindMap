package controller;

import model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList;

    public BookController() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1, "Spring MVC căn bản", "Trần Minh", 150000));
        bookList.add(new Book(2, "Lập trình Java Web", "Nguyễn Đức", 350000));
        bookList.add(new Book(3, "Thuật toán ứng dụng", "Lê Hải", 200000));
        bookList.add(new Book(4, "Kiến trúc hệ thống", "Phạm Hùng", 420000));
    }

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("books", bookList);
        return "books/list";
    }

    @GetMapping("/{id}")
    public String showDetail(@PathVariable("id") int id, Model model) {
        Book foundBook = bookList.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("book", foundBook);
        return "books/detail";
    }
}