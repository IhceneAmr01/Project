package net.javaguides.todoapp.model;

import java.time.LocalDate;

public class Todo {
    private Long id;
    private String title;
    private Long userId; // Foreign key reference
    private String username; // Foreign key reference
    private String description;
    private LocalDate targetDate;
    private boolean status;

    protected Todo() {

    }

    public Todo(Long id, String title, Long userId, String username, String description, LocalDate targetDate, boolean isDone) {
        super();
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.status = isDone;
    }

    public Todo(String title, Long userId, String username, String description, LocalDate targetDate, boolean isDone) {
        super();
        this.title = title;
        this.userId = userId;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.status = isDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Todo other = (Todo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
