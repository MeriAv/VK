public class ManagerPosts {
    // Здесь находится первое задание из дз

    ManagerPosts managerPosts = new ManagerPosts();

    public String[] managerPost() {
        this.managerAuthor();
        this.managerText();
        this.managerActivityString();
        this.managerImg();
        this.managerBlockComments();
        return null;
    }
}


public class managerAuthor {
    private class Author {
        private String name;
        private String timePublicPost;
        private String photo;
        private String iconOpen;
        private String idManagerAuthor;

        public void setIdManagerAuthor(String idManagerAuthor) {
            idManagerAuthor = idManagerAuthor;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public void setIconOpen(String iconOpen) {
            this.iconOpen = iconOpen;
        }

        public void setTimePublicPost(String timePublicPost) {
            this.timePublicPost = timePublicPost;
        }

        public String getName() {
            return name;
        }

        public String getPhoto() {
            return photo;
        }

        public String getIconOpen() {
            return iconOpen;
        }

        public String getTimePublicPost() {
            return timePublicPost;
        }

        public String getIdManagerAuthor() {
            return idManagerAuthor;
        }
    }
}

public class ManagerText {
    private class Text {
        private String text;
        private String idManagerText;

        public void setText(String text) {
            text = text;
        }

        public void setIdManagerText(String idManagerText) {
            idManagerText = idManagerText;
        }

        public String getText() {
            return text;
        }

        public String getIdManagerText() {
            return idManagerText;
        }

    }
}


public class ManagerImg {
    private class img {
        private String img;
        private String idManagerImg;

        public void setImg(String img) {
            img = img;
        }

        public void setIdManagerImg(String idManagerImg) {
            idManagerImg = idManagerImg;
        }

        public String getImg() {
            return img;
        }

        public String getIdManagerImg() {
            return idManagerImg;
        }
    }
}


public class ManagerActivityString {

    public String[] managerActivityString() {
        this.managerLike();
        this.managerComments();
        this.managerReposts();
        this.managerViews();
        return null;
    }
}

public class ManagerLike {
    private String quantityLike;
    private String iconLike;
    private String idManagerLike;

    public void setQuantityLike(String quantityLike) {
        quantityLike = quantityLike;
    }

    public void setIconLike(String iconLike) {
        iconLike = iconLike;
    }

    public void setIdManagerLike(String idManagerLike) {
        idManagerLike = idManagerLike;
    }

    public String getQuantityLike() {
        return quantityLike;
    }

    public String getIconLike() {
        return iconLike;
    }

    public String getIdManagerLike() {
        return idManagerLike;
    }

}

public class ManagerComments {
    private String quantityComments;
    private String idManagerComments;
    private String iconComments;

    public void setQuantityComments(String quantityComments) {
        quantityComments = quantityComments;
    }

    public void setIconComments(String iconComments) {
        iconComments = iconComments;
    }

    public void setIdManagerComments(String idManagerComments) {
        idManagerComments = idManagerComments;
    }

    public String getQuantityComments() {
        return quantityComments;
    }

    public String getIconComments() {
        return iconComments;
    }

    public String getIdManagerComments() {
        return idManagerComments;
    }

}

public class ManagerReposts {
    private String quantityReposts;
    private String iconReposts;
    private String idManagerReposts;

    public void setQuantityReposts(String quantityReposts) {
        quantityReposts = quantityReposts;
    }

    public void setIconReposts(String iconReposts) {
        iconReposts = iconReposts;
    }

    public void setIdManagerReposts(String idManagerReposts) {
        idManagerReposts = idManagerReposts;
    }

    public String getQuantityReposts() {
        return quantityReposts;
    }

    public String getIconReposts() {
        return iconReposts;
    }

    public String getIdManagerReposts() {
        return idManagerReposts;
    }

}

public class ManagerViews {
    private String quantityViews;
    private String iconsViews;
    private String idManagerViews;

    public void setQuantityViews(String quantityViews) {
        quantityViews = quantityViews;
    }

    public void setIconsViews(String iconsViews) {
        iconsViews = iconsViews;
    }

    public void setIdManagerViews(String idManagerViews) {
        idManagerViews = idManagerViews;
    }

    public String getQuantityViews() {
        return quantityViews;
    }

    public String getIconsViews() {
        return iconsViews;
    }

    public String getIdManagerViews() {
        return idManagerViews;
    }

}


public class ManagerBlockComments {

    public String[] managerBlockComments() {
        this.ManagerEveryComments();
        this.ManagerSortComment();
        return null;
    }
}

public class ManagerEveryComments {

    public String[] managerEveryComments() {
        this.EveryComments();
        this.Answer();
        this.FieldAnswer();
        return null;
    }
}

public class EveryComments {
    private String authorName;
    private String authorIcons;
    private String authorPhoto;
    private String text;
    private String timePublicComment;
    private String buttonReply;
    private String buttonLike;
    private String buttonClose;
    private String idManagerEveryComments;

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorIcons() {
        return authorIcons;
    }

    public String getAuthorPhoto() {
        return authorPhoto;
    }

    public String getText() {
        return text;
    }

    public String getTimePublicComment() {
        return timePublicComment;
    }

    public String getButtonReply() {
        return buttonReply;
    }

    public String getButtonLike() {
        return buttonLike;
    }

    public String getButtonClose() {
        return buttonClose;
    }


    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorIcons(String authorIcons) {
        this.authorIcons = authorIcons;
    }

    public void setAuthorPhoto(String authorPhoto) {
        this.authorPhoto = authorPhoto;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTimePublicComment(String timePublicComment) {
        this.timePublicComment = timePublicComment;
    }

    public void setButtonReply(String buttonReply) {
        this.buttonReply = buttonReply;
    }

    public void setButtonLike(String buttonLike) {
        this.buttonLike = buttonLike;
    }

    public void setButtonClose(String buttonClose) {
        this.buttonClose = buttonClose;
    }

    public void setIdManagerEveryComments(String idManagerEveryComments) {
        this.idManagerEveryComments = idManagerEveryComments;
    }
}

public class Answer {
    private String authorAnswer;
    private String authorPhoto;
    private String quantityAnswer;
    private String buttonLike;
    private String buttonClose;
    private String idAnswer;

    public String getAuthorAnswer() {
        return authorAnswer;
    }

    public String getAuthorPhoto() {
        return authorPhoto;
    }

    public String getQuantityAnswer() {
        return quantityAnswer;
    }

    public String getButtonLike() {
        return buttonLike;
    }

    public String getButtonClose() {
        return buttonClose;
    }

    public String getIdAnswer() {
        return idAnswer;
    }

    public void setAuthorAnswer(String authorAnswer) {
        this.authorAnswer = authorAnswer;
    }

    public void setAuthorPhoto(String authorPhoto) {
        this.authorPhoto = authorPhoto;
    }

    public void setQuantityAnswer(String quantityAnswer) {
        this.quantityAnswer = quantityAnswer;
    }

    public void setButtonLike(String buttonLike) {
        this.buttonLike = buttonLike;
    }

    public void setButtonClose(String buttonClose) {
        this.buttonClose = buttonClose;
    }

    public void setIdAnswer(String idAnswer) {
        this.idAnswer = idAnswer;
    }

}

public class FieldAnswer {
    private String icon;
    private String text;
    private String buttonSend;

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setButtonSend(String buttonSend) {
        this.buttonSend = buttonSend;
    }

    public String getIcon() {
        return icon;
    }

    public String getText() {
        return text;
    }

    public String getButtonSend() {
        return buttonSend;
    }
}


public class ManagerSortComment {
    private String buttonInteresting;
    private String buttonOld;
    private String idManagerSortComment;

    public void setButtonInteresting(String buttonInteresting) {
        this.buttonInteresting = buttonInteresting;
    }

    public void setButtonNew(String buttonNew) {
        this.buttonNew = buttonNew;
    }

    public void setButtonOld(String buttonOld) {
        this.buttonOld = buttonOld;
    }

    public void setIdManagerSortComment(String idManagerSortComment) {
        this.idManagerSortComment = idManagerSortComment;
    }

    private String buttonNew;

    public String getButtonInteresting() {
        return buttonInteresting;
    }

    public String getButtonNew() {
        return buttonNew;
    }

    public String getButtonOld() {
        return buttonOld;
    }

    public String getIdManagerSortComment() {
        return idManagerSortComment;
    }

}
    





