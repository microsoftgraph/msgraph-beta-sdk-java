package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DateTimeCustomFieldDefinition extends CustomFieldDefinition implements Parsable {
    /**
     * Instantiates a new {@link DateTimeCustomFieldDefinition} and sets the default values.
     */
    public DateTimeCustomFieldDefinition() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.dateTimeCustomFieldDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DateTimeCustomFieldDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DateTimeCustomFieldDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DateTimeCustomFieldDefinition();
    }
    /**
     * Gets the defaultDateTime property value. The default date/time value applied to the field on a new case. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDefaultDateTime() {
        return this.backingStore.get("defaultDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultDateTime", (n) -> { this.setDefaultDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("defaultDateTime", this.getDefaultDateTime());
    }
    /**
     * Sets the defaultDateTime property value. The default date/time value applied to the field on a new case. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the defaultDateTime property.
     */
    public void setDefaultDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("defaultDateTime", value);
    }
}
