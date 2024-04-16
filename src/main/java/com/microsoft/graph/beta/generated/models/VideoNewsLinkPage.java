package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoNewsLinkPage extends BaseSitePage implements Parsable {
    /**
     * Instantiates a new {@link VideoNewsLinkPage} and sets the default values.
     */
    public VideoNewsLinkPage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoNewsLinkPage}
     */
    @jakarta.annotation.Nonnull
    public static VideoNewsLinkPage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoNewsLinkPage();
    }
    /**
     * Gets the bannerImageWebUrl property value. The bannerImageWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBannerImageWebUrl() {
        return this.backingStore.get("bannerImageWebUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bannerImageWebUrl", (n) -> { this.setBannerImageWebUrl(n.getStringValue()); });
        deserializerMap.put("newsSharepointIds", (n) -> { this.setNewsSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("newsWebUrl", (n) -> { this.setNewsWebUrl(n.getStringValue()); });
        deserializerMap.put("videoDuration", (n) -> { this.setVideoDuration(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newsSharepointIds property value. The newsSharepointIds property
     * @return a {@link SharepointIds}
     */
    @jakarta.annotation.Nullable
    public SharepointIds getNewsSharepointIds() {
        return this.backingStore.get("newsSharepointIds");
    }
    /**
     * Gets the newsWebUrl property value. The newsWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewsWebUrl() {
        return this.backingStore.get("newsWebUrl");
    }
    /**
     * Gets the videoDuration property value. The videoDuration property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getVideoDuration() {
        return this.backingStore.get("videoDuration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("bannerImageWebUrl", this.getBannerImageWebUrl());
        writer.writeObjectValue("newsSharepointIds", this.getNewsSharepointIds());
        writer.writeStringValue("newsWebUrl", this.getNewsWebUrl());
        writer.writePeriodAndDurationValue("videoDuration", this.getVideoDuration());
    }
    /**
     * Sets the bannerImageWebUrl property value. The bannerImageWebUrl property
     * @param value Value to set for the bannerImageWebUrl property.
     */
    public void setBannerImageWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bannerImageWebUrl", value);
    }
    /**
     * Sets the newsSharepointIds property value. The newsSharepointIds property
     * @param value Value to set for the newsSharepointIds property.
     */
    public void setNewsSharepointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.backingStore.set("newsSharepointIds", value);
    }
    /**
     * Sets the newsWebUrl property value. The newsWebUrl property
     * @param value Value to set for the newsWebUrl property.
     */
    public void setNewsWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("newsWebUrl", value);
    }
    /**
     * Sets the videoDuration property value. The videoDuration property
     * @param value Value to set for the videoDuration property.
     */
    public void setVideoDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("videoDuration", value);
    }
}
