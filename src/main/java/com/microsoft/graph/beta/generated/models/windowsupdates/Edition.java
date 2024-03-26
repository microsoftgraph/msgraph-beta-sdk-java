package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Edition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Edition} and sets the default values.
     */
    public Edition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Edition}
     */
    @jakarta.annotation.Nonnull
    public static Edition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Edition();
    }
    /**
     * Gets the deviceFamily property value. The device family targeted by the edition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceFamily() {
        return this.backingStore.get("deviceFamily");
    }
    /**
     * Gets the endOfServiceDateTime property value. The date and time when the edition reached the end of service. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndOfServiceDateTime() {
        return this.backingStore.get("endOfServiceDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceFamily", (n) -> { this.setDeviceFamily(n.getStringValue()); });
        deserializerMap.put("endOfServiceDateTime", (n) -> { this.setEndOfServiceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("generalAvailabilityDateTime", (n) -> { this.setGeneralAvailabilityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isInService", (n) -> { this.setIsInService(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("releasedName", (n) -> { this.setReleasedName(n.getStringValue()); });
        deserializerMap.put("servicingPeriods", (n) -> { this.setServicingPeriods(n.getCollectionOfObjectValues(ServicingPeriod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the generalAvailabilityDateTime property value. The date and time when the edition became available to the general customers for the first time. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGeneralAvailabilityDateTime() {
        return this.backingStore.get("generalAvailabilityDateTime");
    }
    /**
     * Gets the isInService property value. Indicates whether the edition is in service or out of service.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInService() {
        return this.backingStore.get("isInService");
    }
    /**
     * Gets the name property value. The name of the edition. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the releasedName property value. The public name of the edition. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReleasedName() {
        return this.backingStore.get("releasedName");
    }
    /**
     * Gets the servicingPeriods property value. The servicingPeriods property
     * @return a {@link java.util.List<ServicingPeriod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicingPeriod> getServicingPeriods() {
        return this.backingStore.get("servicingPeriods");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceFamily", this.getDeviceFamily());
        writer.writeOffsetDateTimeValue("endOfServiceDateTime", this.getEndOfServiceDateTime());
        writer.writeOffsetDateTimeValue("generalAvailabilityDateTime", this.getGeneralAvailabilityDateTime());
        writer.writeBooleanValue("isInService", this.getIsInService());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("releasedName", this.getReleasedName());
        writer.writeCollectionOfObjectValues("servicingPeriods", this.getServicingPeriods());
    }
    /**
     * Sets the deviceFamily property value. The device family targeted by the edition.
     * @param value Value to set for the deviceFamily property.
     */
    public void setDeviceFamily(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceFamily", value);
    }
    /**
     * Sets the endOfServiceDateTime property value. The date and time when the edition reached the end of service. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the endOfServiceDateTime property.
     */
    public void setEndOfServiceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endOfServiceDateTime", value);
    }
    /**
     * Sets the generalAvailabilityDateTime property value. The date and time when the edition became available to the general customers for the first time. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the generalAvailabilityDateTime property.
     */
    public void setGeneralAvailabilityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("generalAvailabilityDateTime", value);
    }
    /**
     * Sets the isInService property value. Indicates whether the edition is in service or out of service.
     * @param value Value to set for the isInService property.
     */
    public void setIsInService(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInService", value);
    }
    /**
     * Sets the name property value. The name of the edition. Read-only.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the releasedName property value. The public name of the edition. Read-only.
     * @param value Value to set for the releasedName property.
     */
    public void setReleasedName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("releasedName", value);
    }
    /**
     * Sets the servicingPeriods property value. The servicingPeriods property
     * @param value Value to set for the servicingPeriods property.
     */
    public void setServicingPeriods(@jakarta.annotation.Nullable final java.util.List<ServicingPeriod> value) {
        this.backingStore.set("servicingPeriods", value);
    }
}
