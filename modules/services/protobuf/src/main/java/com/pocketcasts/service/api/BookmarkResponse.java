// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.pocketcasts.service.api;

/**
 * Protobuf type {@code api.BookmarkResponse}
 */
public  final class BookmarkResponse extends
    com.google.protobuf.GeneratedMessageLite<
        BookmarkResponse, BookmarkResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:api.BookmarkResponse)
    BookmarkResponseOrBuilder {
  private BookmarkResponse() {
    bookmarkUuid_ = "";
    podcastUuid_ = "";
    episodeUuid_ = "";
    title_ = "";
  }
  public static final int BOOKMARK_UUID_FIELD_NUMBER = 1;
  private java.lang.String bookmarkUuid_;
  /**
   * <code>string bookmark_uuid = 1;</code>
   * @return The bookmarkUuid.
   */
  @java.lang.Override
  public java.lang.String getBookmarkUuid() {
    return bookmarkUuid_;
  }
  /**
   * <code>string bookmark_uuid = 1;</code>
   * @return The bytes for bookmarkUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBookmarkUuidBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(bookmarkUuid_);
  }
  /**
   * <code>string bookmark_uuid = 1;</code>
   * @param value The bookmarkUuid to set.
   */
  private void setBookmarkUuid(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    bookmarkUuid_ = value;
  }
  /**
   * <code>string bookmark_uuid = 1;</code>
   */
  private void clearBookmarkUuid() {

    bookmarkUuid_ = getDefaultInstance().getBookmarkUuid();
  }
  /**
   * <code>string bookmark_uuid = 1;</code>
   * @param value The bytes for bookmarkUuid to set.
   */
  private void setBookmarkUuidBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    bookmarkUuid_ = value.toStringUtf8();

  }

  public static final int PODCAST_UUID_FIELD_NUMBER = 2;
  private java.lang.String podcastUuid_;
  /**
   * <code>string podcast_uuid = 2;</code>
   * @return The podcastUuid.
   */
  @java.lang.Override
  public java.lang.String getPodcastUuid() {
    return podcastUuid_;
  }
  /**
   * <code>string podcast_uuid = 2;</code>
   * @return The bytes for podcastUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPodcastUuidBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(podcastUuid_);
  }
  /**
   * <code>string podcast_uuid = 2;</code>
   * @param value The podcastUuid to set.
   */
  private void setPodcastUuid(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    podcastUuid_ = value;
  }
  /**
   * <code>string podcast_uuid = 2;</code>
   */
  private void clearPodcastUuid() {

    podcastUuid_ = getDefaultInstance().getPodcastUuid();
  }
  /**
   * <code>string podcast_uuid = 2;</code>
   * @param value The bytes for podcastUuid to set.
   */
  private void setPodcastUuidBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    podcastUuid_ = value.toStringUtf8();

  }

  public static final int EPISODE_UUID_FIELD_NUMBER = 3;
  private java.lang.String episodeUuid_;
  /**
   * <code>string episode_uuid = 3;</code>
   * @return The episodeUuid.
   */
  @java.lang.Override
  public java.lang.String getEpisodeUuid() {
    return episodeUuid_;
  }
  /**
   * <code>string episode_uuid = 3;</code>
   * @return The bytes for episodeUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEpisodeUuidBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(episodeUuid_);
  }
  /**
   * <code>string episode_uuid = 3;</code>
   * @param value The episodeUuid to set.
   */
  private void setEpisodeUuid(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    episodeUuid_ = value;
  }
  /**
   * <code>string episode_uuid = 3;</code>
   */
  private void clearEpisodeUuid() {

    episodeUuid_ = getDefaultInstance().getEpisodeUuid();
  }
  /**
   * <code>string episode_uuid = 3;</code>
   * @param value The bytes for episodeUuid to set.
   */
  private void setEpisodeUuidBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    episodeUuid_ = value.toStringUtf8();

  }

  public static final int TIME_FIELD_NUMBER = 5;
  private int time_;
  /**
   * <code>int32 time = 5;</code>
   * @return The time.
   */
  @java.lang.Override
  public int getTime() {
    return time_;
  }
  /**
   * <code>int32 time = 5;</code>
   * @param value The time to set.
   */
  private void setTime(int value) {
    
    time_ = value;
  }
  /**
   * <code>int32 time = 5;</code>
   */
  private void clearTime() {

    time_ = 0;
  }

  public static final int TITLE_FIELD_NUMBER = 6;
  private java.lang.String title_;
  /**
   * <code>string title = 6;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    return title_;
  }
  /**
   * <code>string title = 6;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(title_);
  }
  /**
   * <code>string title = 6;</code>
   * @param value The title to set.
   */
  private void setTitle(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    title_ = value;
  }
  /**
   * <code>string title = 6;</code>
   */
  private void clearTitle() {

    title_ = getDefaultInstance().getTitle();
  }
  /**
   * <code>string title = 6;</code>
   * @param value The bytes for title to set.
   */
  private void setTitleBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    title_ = value.toStringUtf8();

  }

  public static final int CREATEDAT_FIELD_NUMBER = 7;
  private com.google.protobuf.Timestamp createdAt_;
  /**
   * <code>.google.protobuf.Timestamp createdAt = 7;</code>
   */
  @java.lang.Override
  public boolean hasCreatedAt() {
    return createdAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp createdAt = 7;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreatedAt() {
    return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp createdAt = 7;</code>
   */
  private void setCreatedAt(com.google.protobuf.Timestamp value) {
    value.getClass();
  createdAt_ = value;

    }
  /**
   * <code>.google.protobuf.Timestamp createdAt = 7;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeCreatedAt(com.google.protobuf.Timestamp value) {
    value.getClass();
  if (createdAt_ != null &&
        createdAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      createdAt_ =
        com.google.protobuf.Timestamp.newBuilder(createdAt_).mergeFrom(value).buildPartial();
    } else {
      createdAt_ = value;
    }

  }
  /**
   * <code>.google.protobuf.Timestamp createdAt = 7;</code>
   */
  private void clearCreatedAt() {  createdAt_ = null;

  }

  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.pocketcasts.service.api.BookmarkResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.pocketcasts.service.api.BookmarkResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.pocketcasts.service.api.BookmarkResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.pocketcasts.service.api.BookmarkResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code api.BookmarkResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.pocketcasts.service.api.BookmarkResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:api.BookmarkResponse)
      com.pocketcasts.service.api.BookmarkResponseOrBuilder {
    // Construct using com.pocketcasts.service.api.BookmarkResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string bookmark_uuid = 1;</code>
     * @return The bookmarkUuid.
     */
    @java.lang.Override
    public java.lang.String getBookmarkUuid() {
      return instance.getBookmarkUuid();
    }
    /**
     * <code>string bookmark_uuid = 1;</code>
     * @return The bytes for bookmarkUuid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBookmarkUuidBytes() {
      return instance.getBookmarkUuidBytes();
    }
    /**
     * <code>string bookmark_uuid = 1;</code>
     * @param value The bookmarkUuid to set.
     * @return This builder for chaining.
     */
    public Builder setBookmarkUuid(
        java.lang.String value) {
      copyOnWrite();
      instance.setBookmarkUuid(value);
      return this;
    }
    /**
     * <code>string bookmark_uuid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBookmarkUuid() {
      copyOnWrite();
      instance.clearBookmarkUuid();
      return this;
    }
    /**
     * <code>string bookmark_uuid = 1;</code>
     * @param value The bytes for bookmarkUuid to set.
     * @return This builder for chaining.
     */
    public Builder setBookmarkUuidBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBookmarkUuidBytes(value);
      return this;
    }

    /**
     * <code>string podcast_uuid = 2;</code>
     * @return The podcastUuid.
     */
    @java.lang.Override
    public java.lang.String getPodcastUuid() {
      return instance.getPodcastUuid();
    }
    /**
     * <code>string podcast_uuid = 2;</code>
     * @return The bytes for podcastUuid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPodcastUuidBytes() {
      return instance.getPodcastUuidBytes();
    }
    /**
     * <code>string podcast_uuid = 2;</code>
     * @param value The podcastUuid to set.
     * @return This builder for chaining.
     */
    public Builder setPodcastUuid(
        java.lang.String value) {
      copyOnWrite();
      instance.setPodcastUuid(value);
      return this;
    }
    /**
     * <code>string podcast_uuid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPodcastUuid() {
      copyOnWrite();
      instance.clearPodcastUuid();
      return this;
    }
    /**
     * <code>string podcast_uuid = 2;</code>
     * @param value The bytes for podcastUuid to set.
     * @return This builder for chaining.
     */
    public Builder setPodcastUuidBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPodcastUuidBytes(value);
      return this;
    }

    /**
     * <code>string episode_uuid = 3;</code>
     * @return The episodeUuid.
     */
    @java.lang.Override
    public java.lang.String getEpisodeUuid() {
      return instance.getEpisodeUuid();
    }
    /**
     * <code>string episode_uuid = 3;</code>
     * @return The bytes for episodeUuid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEpisodeUuidBytes() {
      return instance.getEpisodeUuidBytes();
    }
    /**
     * <code>string episode_uuid = 3;</code>
     * @param value The episodeUuid to set.
     * @return This builder for chaining.
     */
    public Builder setEpisodeUuid(
        java.lang.String value) {
      copyOnWrite();
      instance.setEpisodeUuid(value);
      return this;
    }
    /**
     * <code>string episode_uuid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpisodeUuid() {
      copyOnWrite();
      instance.clearEpisodeUuid();
      return this;
    }
    /**
     * <code>string episode_uuid = 3;</code>
     * @param value The bytes for episodeUuid to set.
     * @return This builder for chaining.
     */
    public Builder setEpisodeUuidBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEpisodeUuidBytes(value);
      return this;
    }

    /**
     * <code>int32 time = 5;</code>
     * @return The time.
     */
    @java.lang.Override
    public int getTime() {
      return instance.getTime();
    }
    /**
     * <code>int32 time = 5;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(int value) {
      copyOnWrite();
      instance.setTime(value);
      return this;
    }
    /**
     * <code>int32 time = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      copyOnWrite();
      instance.clearTime();
      return this;
    }

    /**
     * <code>string title = 6;</code>
     * @return The title.
     */
    @java.lang.Override
    public java.lang.String getTitle() {
      return instance.getTitle();
    }
    /**
     * <code>string title = 6;</code>
     * @return The bytes for title.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return instance.getTitleBytes();
    }
    /**
     * <code>string title = 6;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      copyOnWrite();
      instance.setTitle(value);
      return this;
    }
    /**
     * <code>string title = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      copyOnWrite();
      instance.clearTitle();
      return this;
    }
    /**
     * <code>string title = 6;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTitleBytes(value);
      return this;
    }

    /**
     * <code>.google.protobuf.Timestamp createdAt = 7;</code>
     */
    @java.lang.Override
    public boolean hasCreatedAt() {
      return instance.hasCreatedAt();
    }
    /**
     * <code>.google.protobuf.Timestamp createdAt = 7;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getCreatedAt() {
      return instance.getCreatedAt();
    }
    /**
     * <code>.google.protobuf.Timestamp createdAt = 7;</code>
     */
    public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setCreatedAt(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Timestamp createdAt = 7;</code>
     */
    public Builder setCreatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setCreatedAt(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp createdAt = 7;</code>
     */
    public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeCreatedAt(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp createdAt = 7;</code>
     */
    public Builder clearCreatedAt() {  copyOnWrite();
      instance.clearCreatedAt();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:api.BookmarkResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.pocketcasts.service.api.BookmarkResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bookmarkUuid_",
            "podcastUuid_",
            "episodeUuid_",
            "time_",
            "title_",
            "createdAt_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0005\u0004\u0006\u0208\u0007\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.pocketcasts.service.api.BookmarkResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.pocketcasts.service.api.BookmarkResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.pocketcasts.service.api.BookmarkResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:api.BookmarkResponse)
  private static final com.pocketcasts.service.api.BookmarkResponse DEFAULT_INSTANCE;
  static {
    BookmarkResponse defaultInstance = new BookmarkResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      BookmarkResponse.class, defaultInstance);
  }

  public static com.pocketcasts.service.api.BookmarkResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BookmarkResponse> PARSER;

  public static com.google.protobuf.Parser<BookmarkResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

