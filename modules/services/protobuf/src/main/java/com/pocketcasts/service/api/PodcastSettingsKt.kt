// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package com.pocketcasts.service.api

@kotlin.jvm.JvmName("-initializepodcastSettings")
public inline fun podcastSettings(block: com.pocketcasts.service.api.PodcastSettingsKt.Dsl.() -> kotlin.Unit): com.pocketcasts.service.api.PodcastSettings =
    com.pocketcasts.service.api.PodcastSettingsKt.Dsl._create(com.pocketcasts.service.api.PodcastSettings.newBuilder()).apply { block() }._build()

/**
 * Protobuf type `api.PodcastSettings`
 */
public object PodcastSettingsKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.pocketcasts.service.api.PodcastSettings.Builder,
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: com.pocketcasts.service.api.PodcastSettings.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): com.pocketcasts.service.api.PodcastSettings = _builder.build()

        /**
         * `.api.BoolSetting notification = 1;`
         */
        public var notification: com.pocketcasts.service.api.BoolSetting
            @JvmName("getNotification")
            get() = _builder.getNotification()

            @JvmName("setNotification")
            set(value) {
                _builder.setNotification(value)
            }

        /**
         * `.api.BoolSetting notification = 1;`
         */
        public fun clearNotification() {
            _builder.clearNotification()
        }

        /**
         * `.api.BoolSetting notification = 1;`
         * @return Whether the notification field is set.
         */
        public fun hasNotification(): kotlin.Boolean {
            return _builder.hasNotification()
        }

        /**
         * `.api.BoolSetting add_to_up_next = 2;`
         */
        public var addToUpNext: com.pocketcasts.service.api.BoolSetting
            @JvmName("getAddToUpNext")
            get() = _builder.getAddToUpNext()

            @JvmName("setAddToUpNext")
            set(value) {
                _builder.setAddToUpNext(value)
            }

        /**
         * `.api.BoolSetting add_to_up_next = 2;`
         */
        public fun clearAddToUpNext() {
            _builder.clearAddToUpNext()
        }

        /**
         * `.api.BoolSetting add_to_up_next = 2;`
         * @return Whether the addToUpNext field is set.
         */
        public fun hasAddToUpNext(): kotlin.Boolean {
            return _builder.hasAddToUpNext()
        }

        /**
         * `.api.Int32Setting add_to_up_next_position = 3;`
         */
        public var addToUpNextPosition: com.pocketcasts.service.api.Int32Setting
            @JvmName("getAddToUpNextPosition")
            get() = _builder.getAddToUpNextPosition()

            @JvmName("setAddToUpNextPosition")
            set(value) {
                _builder.setAddToUpNextPosition(value)
            }

        /**
         * `.api.Int32Setting add_to_up_next_position = 3;`
         */
        public fun clearAddToUpNextPosition() {
            _builder.clearAddToUpNextPosition()
        }

        /**
         * `.api.Int32Setting add_to_up_next_position = 3;`
         * @return Whether the addToUpNextPosition field is set.
         */
        public fun hasAddToUpNextPosition(): kotlin.Boolean {
            return _builder.hasAddToUpNextPosition()
        }

        /**
         * `.api.BoolSetting auto_archive = 4;`
         */
        public var autoArchive: com.pocketcasts.service.api.BoolSetting
            @JvmName("getAutoArchive")
            get() = _builder.getAutoArchive()

            @JvmName("setAutoArchive")
            set(value) {
                _builder.setAutoArchive(value)
            }

        /**
         * `.api.BoolSetting auto_archive = 4;`
         */
        public fun clearAutoArchive() {
            _builder.clearAutoArchive()
        }

        /**
         * `.api.BoolSetting auto_archive = 4;`
         * @return Whether the autoArchive field is set.
         */
        public fun hasAutoArchive(): kotlin.Boolean {
            return _builder.hasAutoArchive()
        }

        /**
         * `.api.BoolSetting playback_effects = 5;`
         */
        public var playbackEffects: com.pocketcasts.service.api.BoolSetting
            @JvmName("getPlaybackEffects")
            get() = _builder.getPlaybackEffects()

            @JvmName("setPlaybackEffects")
            set(value) {
                _builder.setPlaybackEffects(value)
            }

        /**
         * `.api.BoolSetting playback_effects = 5;`
         */
        public fun clearPlaybackEffects() {
            _builder.clearPlaybackEffects()
        }

        /**
         * `.api.BoolSetting playback_effects = 5;`
         * @return Whether the playbackEffects field is set.
         */
        public fun hasPlaybackEffects(): kotlin.Boolean {
            return _builder.hasPlaybackEffects()
        }

        /**
         * `.api.DoubleSetting playback_speed = 6;`
         */
        public var playbackSpeed: com.pocketcasts.service.api.DoubleSetting
            @JvmName("getPlaybackSpeed")
            get() = _builder.getPlaybackSpeed()

            @JvmName("setPlaybackSpeed")
            set(value) {
                _builder.setPlaybackSpeed(value)
            }

        /**
         * `.api.DoubleSetting playback_speed = 6;`
         */
        public fun clearPlaybackSpeed() {
            _builder.clearPlaybackSpeed()
        }

        /**
         * `.api.DoubleSetting playback_speed = 6;`
         * @return Whether the playbackSpeed field is set.
         */
        public fun hasPlaybackSpeed(): kotlin.Boolean {
            return _builder.hasPlaybackSpeed()
        }

        /**
         * `.api.Int32Setting trim_silence = 7;`
         */
        public var trimSilence: com.pocketcasts.service.api.Int32Setting
            @JvmName("getTrimSilence")
            get() = _builder.getTrimSilence()

            @JvmName("setTrimSilence")
            set(value) {
                _builder.setTrimSilence(value)
            }

        /**
         * `.api.Int32Setting trim_silence = 7;`
         */
        public fun clearTrimSilence() {
            _builder.clearTrimSilence()
        }

        /**
         * `.api.Int32Setting trim_silence = 7;`
         * @return Whether the trimSilence field is set.
         */
        public fun hasTrimSilence(): kotlin.Boolean {
            return _builder.hasTrimSilence()
        }

        /**
         * `.api.BoolSetting volume_boost = 8;`
         */
        public var volumeBoost: com.pocketcasts.service.api.BoolSetting
            @JvmName("getVolumeBoost")
            get() = _builder.getVolumeBoost()

            @JvmName("setVolumeBoost")
            set(value) {
                _builder.setVolumeBoost(value)
            }

        /**
         * `.api.BoolSetting volume_boost = 8;`
         */
        public fun clearVolumeBoost() {
            _builder.clearVolumeBoost()
        }

        /**
         * `.api.BoolSetting volume_boost = 8;`
         * @return Whether the volumeBoost field is set.
         */
        public fun hasVolumeBoost(): kotlin.Boolean {
            return _builder.hasVolumeBoost()
        }

        /**
         * `.api.Int32Setting auto_start_from = 9;`
         */
        public var autoStartFrom: com.pocketcasts.service.api.Int32Setting
            @JvmName("getAutoStartFrom")
            get() = _builder.getAutoStartFrom()

            @JvmName("setAutoStartFrom")
            set(value) {
                _builder.setAutoStartFrom(value)
            }

        /**
         * `.api.Int32Setting auto_start_from = 9;`
         */
        public fun clearAutoStartFrom() {
            _builder.clearAutoStartFrom()
        }

        /**
         * `.api.Int32Setting auto_start_from = 9;`
         * @return Whether the autoStartFrom field is set.
         */
        public fun hasAutoStartFrom(): kotlin.Boolean {
            return _builder.hasAutoStartFrom()
        }

        /**
         * `.api.Int32Setting auto_skip_last = 10;`
         */
        public var autoSkipLast: com.pocketcasts.service.api.Int32Setting
            @JvmName("getAutoSkipLast")
            get() = _builder.getAutoSkipLast()

            @JvmName("setAutoSkipLast")
            set(value) {
                _builder.setAutoSkipLast(value)
            }

        /**
         * `.api.Int32Setting auto_skip_last = 10;`
         */
        public fun clearAutoSkipLast() {
            _builder.clearAutoSkipLast()
        }

        /**
         * `.api.Int32Setting auto_skip_last = 10;`
         * @return Whether the autoSkipLast field is set.
         */
        public fun hasAutoSkipLast(): kotlin.Boolean {
            return _builder.hasAutoSkipLast()
        }

        /**
         * `.api.Int32Setting episodes_sort_order = 11;`
         */
        public var episodesSortOrder: com.pocketcasts.service.api.Int32Setting
            @JvmName("getEpisodesSortOrder")
            get() = _builder.getEpisodesSortOrder()

            @JvmName("setEpisodesSortOrder")
            set(value) {
                _builder.setEpisodesSortOrder(value)
            }

        /**
         * `.api.Int32Setting episodes_sort_order = 11;`
         */
        public fun clearEpisodesSortOrder() {
            _builder.clearEpisodesSortOrder()
        }

        /**
         * `.api.Int32Setting episodes_sort_order = 11;`
         * @return Whether the episodesSortOrder field is set.
         */
        public fun hasEpisodesSortOrder(): kotlin.Boolean {
            return _builder.hasEpisodesSortOrder()
        }
    }
}
public inline fun com.pocketcasts.service.api.PodcastSettings.copy(block: `com.pocketcasts.service.api`.PodcastSettingsKt.Dsl.() -> kotlin.Unit): com.pocketcasts.service.api.PodcastSettings =
    `com.pocketcasts.service.api`.PodcastSettingsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.notificationOrNull: com.pocketcasts.service.api.BoolSetting?
    get() = if (hasNotification()) getNotification() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.addToUpNextOrNull: com.pocketcasts.service.api.BoolSetting?
    get() = if (hasAddToUpNext()) getAddToUpNext() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.addToUpNextPositionOrNull: com.pocketcasts.service.api.Int32Setting?
    get() = if (hasAddToUpNextPosition()) getAddToUpNextPosition() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.autoArchiveOrNull: com.pocketcasts.service.api.BoolSetting?
    get() = if (hasAutoArchive()) getAutoArchive() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.playbackEffectsOrNull: com.pocketcasts.service.api.BoolSetting?
    get() = if (hasPlaybackEffects()) getPlaybackEffects() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.playbackSpeedOrNull: com.pocketcasts.service.api.DoubleSetting?
    get() = if (hasPlaybackSpeed()) getPlaybackSpeed() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.trimSilenceOrNull: com.pocketcasts.service.api.Int32Setting?
    get() = if (hasTrimSilence()) getTrimSilence() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.volumeBoostOrNull: com.pocketcasts.service.api.BoolSetting?
    get() = if (hasVolumeBoost()) getVolumeBoost() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.autoStartFromOrNull: com.pocketcasts.service.api.Int32Setting?
    get() = if (hasAutoStartFrom()) getAutoStartFrom() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.autoSkipLastOrNull: com.pocketcasts.service.api.Int32Setting?
    get() = if (hasAutoSkipLast()) getAutoSkipLast() else null

public val com.pocketcasts.service.api.PodcastSettingsOrBuilder.episodesSortOrderOrNull: com.pocketcasts.service.api.Int32Setting?
    get() = if (hasEpisodesSortOrder()) getEpisodesSortOrder() else null