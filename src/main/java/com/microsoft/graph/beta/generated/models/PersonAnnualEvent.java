package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PersonAnnualEvent extends ItemFacet implements Parsable {
    /**
     * Instantiates a new PersonAnnualEvent and sets the default values.
     */
    public PersonAnnualEvent() {
        super();
        this.setOdataType("#microsoft.graph.personAnnualEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PersonAnnualEvent
     */
    @jakarta.annotation.Nonnull
    public static PersonAnnualEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonAnnualEvent();
    }
    /**
     * Gets the date property value. The date property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getDate() {
        return this.backingStore.get("date");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("date", (n) -> { this.setDate(n.getLocalDateValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PersonAnnualEventType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. The type property
     * @return a PersonAnnualEventType
     */
    @jakarta.annotation.Nullable
    public PersonAnnualEventType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("date", this.getDate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the date property value. The date property
     * @param value Value to set for the date property.
     */
    public void setDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("date", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PersonAnnualEventType value) {
        this.backingStore.set("type", value);
    }
}
