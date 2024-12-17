package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Announcement extends ChangeItemBase implements Parsable {
    /**
     * Instantiates a new {@link Announcement} and sets the default values.
     */
    public Announcement() {
        super();
        this.setOdataType("#microsoft.graph.announcement");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Announcement}
     */
    @jakarta.annotation.Nonnull
    public static Announcement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Announcement();
    }
    /**
     * Gets the announcementDateTime property value. Change announcement date. Supports $filter (eq, ne, gt, lt, le and ge on year(), month(), day(), hour(), minute(), and second() built in functions) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnnouncementDateTime() {
        return this.backingStore.get("announcementDateTime");
    }
    /**
     * Gets the changeType property value. The changeType property
     * @return a {@link ChangeAnnouncementChangeType}
     */
    @jakarta.annotation.Nullable
    public ChangeAnnouncementChangeType getChangeType() {
        return this.backingStore.get("changeType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("announcementDateTime", (n) -> { this.setAnnouncementDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("changeType", (n) -> { this.setChangeType(n.getEnumValue(ChangeAnnouncementChangeType::forValue)); });
        deserializerMap.put("impactLink", (n) -> { this.setImpactLink(n.getStringValue()); });
        deserializerMap.put("isCustomerActionRequired", (n) -> { this.setIsCustomerActionRequired(n.getBooleanValue()); });
        deserializerMap.put("targetDateTime", (n) -> { this.setTargetDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the impactLink property value. Change impact URL. Supports $filter (eq, ne, in) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImpactLink() {
        return this.backingStore.get("impactLink");
    }
    /**
     * Gets the isCustomerActionRequired property value. Indicates whether the customer needs to take any action for this change. Supports $filter (eq, ne).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomerActionRequired() {
        return this.backingStore.get("isCustomerActionRequired");
    }
    /**
     * Gets the targetDateTime property value. Date on which the change rolls out. Supports $filter (eq, ne, gt, lt, le and ge on year(), month(), day(), hour(), minute(), and second() built in functions) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTargetDateTime() {
        return this.backingStore.get("targetDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("announcementDateTime", this.getAnnouncementDateTime());
        writer.writeEnumValue("changeType", this.getChangeType());
        writer.writeStringValue("impactLink", this.getImpactLink());
        writer.writeBooleanValue("isCustomerActionRequired", this.getIsCustomerActionRequired());
        writer.writeOffsetDateTimeValue("targetDateTime", this.getTargetDateTime());
    }
    /**
     * Sets the announcementDateTime property value. Change announcement date. Supports $filter (eq, ne, gt, lt, le and ge on year(), month(), day(), hour(), minute(), and second() built in functions) and $orderby.
     * @param value Value to set for the announcementDateTime property.
     */
    public void setAnnouncementDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("announcementDateTime", value);
    }
    /**
     * Sets the changeType property value. The changeType property
     * @param value Value to set for the changeType property.
     */
    public void setChangeType(@jakarta.annotation.Nullable final ChangeAnnouncementChangeType value) {
        this.backingStore.set("changeType", value);
    }
    /**
     * Sets the impactLink property value. Change impact URL. Supports $filter (eq, ne, in) and $orderby.
     * @param value Value to set for the impactLink property.
     */
    public void setImpactLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("impactLink", value);
    }
    /**
     * Sets the isCustomerActionRequired property value. Indicates whether the customer needs to take any action for this change. Supports $filter (eq, ne).
     * @param value Value to set for the isCustomerActionRequired property.
     */
    public void setIsCustomerActionRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCustomerActionRequired", value);
    }
    /**
     * Sets the targetDateTime property value. Date on which the change rolls out. Supports $filter (eq, ne, gt, lt, le and ge on year(), month(), day(), hour(), minute(), and second() built in functions) and $orderby.
     * @param value Value to set for the targetDateTime property.
     */
    public void setTargetDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("targetDateTime", value);
    }
}
