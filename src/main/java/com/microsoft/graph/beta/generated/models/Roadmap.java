package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Roadmap extends ChangeItemBase implements Parsable {
    /**
     * Instantiates a new {@link Roadmap} and sets the default values.
     */
    public Roadmap() {
        super();
        this.setOdataType("#microsoft.graph.roadmap");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Roadmap}
     */
    @jakarta.annotation.Nonnull
    public static Roadmap createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Roadmap();
    }
    /**
     * Gets the category property value. Indicates the category with which this item is associated. Supports $filter (eq, ne, in) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the changeItemState property value. The changeItemState property
     * @return a {@link ChangeItemState}
     */
    @jakarta.annotation.Nullable
    public ChangeItemState getChangeItemState() {
        return this.backingStore.get("changeItemState");
    }
    /**
     * Gets the deliveryStage property value. The deliveryStage property
     * @return a {@link RoadmapItemDeliveryStage}
     */
    @jakarta.annotation.Nullable
    public RoadmapItemDeliveryStage getDeliveryStage() {
        return this.backingStore.get("deliveryStage");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("changeItemState", (n) -> { this.setChangeItemState(n.getEnumValue(ChangeItemState::forValue)); });
        deserializerMap.put("deliveryStage", (n) -> { this.setDeliveryStage(n.getEnumValue(RoadmapItemDeliveryStage::forValue)); });
        deserializerMap.put("gotoLink", (n) -> { this.setGotoLink(n.getStringValue()); });
        deserializerMap.put("publishedDateTime", (n) -> { this.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gotoLink property value. Link to the feature page in the Microsoft Entra admin center. Supports $filter (eq, ne, in) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGotoLink() {
        return this.backingStore.get("gotoLink");
    }
    /**
     * Gets the publishedDateTime property value. Feature planned release date. Supports $filter (eq, ne, gt, lt, le and ge on year(), month(), day(), hour(), minute(), and second() built in functions) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.backingStore.get("publishedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeEnumValue("changeItemState", this.getChangeItemState());
        writer.writeEnumValue("deliveryStage", this.getDeliveryStage());
        writer.writeStringValue("gotoLink", this.getGotoLink());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
    }
    /**
     * Sets the category property value. Indicates the category with which this item is associated. Supports $filter (eq, ne, in) and $orderby.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the changeItemState property value. The changeItemState property
     * @param value Value to set for the changeItemState property.
     */
    public void setChangeItemState(@jakarta.annotation.Nullable final ChangeItemState value) {
        this.backingStore.set("changeItemState", value);
    }
    /**
     * Sets the deliveryStage property value. The deliveryStage property
     * @param value Value to set for the deliveryStage property.
     */
    public void setDeliveryStage(@jakarta.annotation.Nullable final RoadmapItemDeliveryStage value) {
        this.backingStore.set("deliveryStage", value);
    }
    /**
     * Sets the gotoLink property value. Link to the feature page in the Microsoft Entra admin center. Supports $filter (eq, ne, in) and $orderby.
     * @param value Value to set for the gotoLink property.
     */
    public void setGotoLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("gotoLink", value);
    }
    /**
     * Sets the publishedDateTime property value. Feature planned release date. Supports $filter (eq, ne, gt, lt, le and ge on year(), month(), day(), hour(), minute(), and second() built in functions) and $orderby.
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("publishedDateTime", value);
    }
}
