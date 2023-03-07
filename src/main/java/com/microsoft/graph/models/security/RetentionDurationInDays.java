package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RetentionDurationInDays extends RetentionDuration implements Parsable {
    /** Specifies the time period in days for which an item with the applied retention label will be retained for. */
    private Integer days;
    /**
     * Instantiates a new RetentionDurationInDays and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RetentionDurationInDays() {
        super();
        this.setOdataType("#microsoft.graph.security.retentionDurationInDays");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RetentionDurationInDays
     */
    @javax.annotation.Nonnull
    public static RetentionDurationInDays createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionDurationInDays();
    }
    /**
     * Gets the days property value. Specifies the time period in days for which an item with the applied retention label will be retained for.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDays() {
        return this.days;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("days", (n) -> { this.setDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("days", this.getDays());
    }
    /**
     * Sets the days property value. Specifies the time period in days for which an item with the applied retention label will be retained for.
     * @param value Value to set for the days property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDays(@javax.annotation.Nullable final Integer value) {
        this.days = value;
    }
}
