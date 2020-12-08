public class ManagerPosts {

    ManagerPosts managerPosts = new ManagerPosts();

    public String[] ManagerPost() {
        this.ManagerAuthor();
        this.ManagerText();
        this.ManagerActivityString();
        this.ManagerImg();
        this.ManagerBlockComments();
        return null;
    }


    public class ManagerAuthor {
        private class Author {
            private String name;
            private String timePublicPost;
            private String photo;
            private String iconOpen;
            private String IdManagerAuthor;

            public void setIdManagerAuthor(String idManagerAuthor) {
                IdManagerAuthor = idManagerAuthor;
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
                return IdManagerAuthor;
            }
        }
    }

    public class ManagerText {
        private class Text {
            private String Text;
            private String IdManagerText;

            public void setText(String text) {
                Text = text;
            }

            public void setIdManagerText(String idManagerText) {
                IdManagerText = idManagerText;
            }

            public String getText() {
                return Text;
            }

            public String getIdManagerText() {
                return IdManagerText;
            }


        }
    }

    public class ManagerImg {
        private class Img {
            private String Img;
            private String IdManagerImg;

            public void setImg(String img) {
                Img = img;
            }

            public void setIdManagerImg(String idManagerImg) {
                IdManagerImg = idManagerImg;
            }

            public String getImg() {
                return Img;
            }

            public String getIdManagerImg() {
                return IdManagerImg;
            }


        }
    }

    public class ManagerActivityString {

        public String[] ManagerActivityString() {
            this.ManagerLike();
            this.ManagerComments();
            this.ManagerReposts();
            this.ManagerViews();
            return null;
        }

        private class ManagerLike {
            private String QuantityLike;
            private String IconLike;
            private String IdManagerLike;

            public void setQuantityLike(String quantityLike) {
                QuantityLike = quantityLike;
            }

            public void setIconLike(String iconLike) {
                IconLike = iconLike;
            }

            public void setIdManagerLike(String idManagerLike) {
                IdManagerLike = idManagerLike;
            }

            public String getQuantityLike() {
                return QuantityLike;
            }

            public String getIconLike() {
                return IconLike;
            }

            public String getIdManagerLike() {
                return IdManagerLike;
            }

        }

        private class ManagerComments {
            private String QuantityComments;
            private String IdManagerComments;
            private String IconComments;

            public void setQuantityComments(String quantityComments) {
                QuantityComments = quantityComments;
            }

            public void setIconComments(String iconComments) {
                IconComments = iconComments;
            }

            public void setIdManagerComments(String idManagerComments) {
                IdManagerComments = idManagerComments;
            }

            public String getQuantityComments() {
                return QuantityComments;
            }

            public String getIconComments() {
                return IconComments;
            }

            public String getIdManagerComments() {
                return IdManagerComments;
            }

        }

        private class ManagerReposts {
            private String QuantityReposts;
            private String IconReposts;
            private String IdManagerReposts;

            public void setQuantityReposts(String quantityReposts) {
                QuantityReposts = quantityReposts;
            }

            public void setIconReposts(String iconReposts) {
                IconReposts = iconReposts;
            }

            public void setIdManagerReposts(String idManagerReposts) {
                IdManagerReposts = idManagerReposts;
            }

            public String getQuantityReposts() {
                return QuantityReposts;
            }

            public String getIconReposts() {
                return IconReposts;
            }

            public String getIdManagerReposts() {
                return IdManagerReposts;
            }

        }

        private class ManagerViews {
            private String QuantityViews;
            private String IconsViews;
            private String IdManagerViews;

            public void setQuantityViews(String quantityViews) {
                QuantityViews = quantityViews;
            }

            public void setIconsViews(String iconsViews) {
                IconsViews = iconsViews;
            }

            public void setIdManagerViews(String idManagerViews) {
                IdManagerViews = idManagerViews;
            }

            public String getQuantityViews() {
                return QuantityViews;
            }

            public String getIconsViews() {
                return IconsViews;
            }

            public String getIdManagerViews() {
                return IdManagerViews;
            }

        }
    }


    public class ManagerBlockComments {

        public String[] ManagerBlockComments() {
            this.ManagerEveryComments();
            this.ManagerSortComment();
            return null;
        }

        public class ManagerEveryComments {

            public String[] ManagerEveryComments() {
                this.EveryComments();
                this.Answer();
                this.FieldAnswer();
                return null;
            }

            public class EveryComments {
                private String AuthorName;
                private String AuthorIcons;
                private String AuthorPhoto;
                private String Text;
                private String TimePublicComment;
                private String ButtonReply;
                private String ButtonLike;
                private String ButtonClose;
                private String IdManagerEveryComments;

                public void setAuthorName(String authorName) {
                    AuthorName = authorName;
                }

                public void setAuthorIcons(String authorIcons) {
                    AuthorIcons = authorIcons;
                }

                public void setAuthorPhoto(String authorPhoto) {
                    AuthorPhoto = authorPhoto;
                }

                public void setText(String text) {
                    Text = text;
                }

                public void setTimePublicComment(String timePublicComment) {
                    TimePublicComment = timePublicComment;
                }

                public void setButtonReply(String buttonReply) {
                    ButtonReply = buttonReply;
                }

                public void setButtonLike(String buttonLike) {
                    ButtonLike = buttonLike;
                }

                public void setButtonClose(String buttonClose) {
                    ButtonClose = buttonClose;
                }

                public String getAuthorName() {
                    return AuthorName;
                }

                public String getAuthorIcons() {
                    return AuthorIcons;
                }

                public String getAuthorPhoto() {
                    return AuthorPhoto;
                }

                public String getText() {
                    return Text;
                }

                public String getTimePublicComment() {
                    return TimePublicComment;
                }

                public String getButtonReply() {
                    return ButtonReply;
                }

                public String getButtonLike() {
                    return ButtonLike;
                }

                public String getButtonClose() {
                    return ButtonClose;
                }

            }

            public class Answer {
                private String AuthorAnswer;
                private String AuthorPhoto;
                private String QuantityAnswer;
                private String ButtonLike;
                private String ButtonClose;
                private String IdAnswer;

                public void setAuthorAnswer(String authorAnswer) {
                    AuthorAnswer = authorAnswer;
                }

                public void setAuthorPhoto(String authorPhoto) {
                    AuthorPhoto = authorPhoto;
                }

                public void setQuantityAnswer(String quantityAnswer) {
                    QuantityAnswer = quantityAnswer;
                }

                public void setButtonLike(String buttonLike) {
                    ButtonLike = buttonLike;
                }

                public void setButtonClose(String buttonClose) {
                    ButtonClose = buttonClose;
                }

                public String getAuthorAnswer() {
                    return AuthorAnswer;
                }

                public String getAuthorPhoto() {
                    return AuthorPhoto;
                }

                public String getQuantityAnswer() {
                    return QuantityAnswer;
                }

                public String getButtonLike() {
                    return ButtonLike;
                }

                public String getButtonClose() {
                    return ButtonClose;
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
        }

        public class ManagerSortComment {
            private String ButtonInteresting;
            private String ButtonNew;
            private String ButtonOld;
            private String IdManagerSortComment;

            public void setButtonInteresting(String buttonInteresting) {
                ButtonInteresting = buttonInteresting;
            }

            public void setButtonNew(String buttonNew) {
                ButtonNew = buttonNew;
            }

            public void setButtonOld(String buttonOld) {
                ButtonOld = buttonOld;
            }

            public void setIdManagerSortComment(String idManagerSortComment) {
                IdManagerSortComment = idManagerSortComment;
            }

            public String getButtonInteresting() {
                return ButtonInteresting;
            }

            public String getButtonNew() {
                return ButtonNew;
            }

            public String getButtonOld() {
                return ButtonOld;
            }

            public String getIdManagerSortComment() {
                return IdManagerSortComment;
            }
        }
    }
}

// Здесь заканчивается первая часть дз, начинается задание 2




