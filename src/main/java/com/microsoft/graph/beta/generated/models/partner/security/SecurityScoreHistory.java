package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityScoreHistory extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SecurityScoreHistory} and sets the default values.
     */
    public SecurityScoreHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityScoreHistory}
     */
    @jakarta.annotation.Nonnull
    public static SecurityScoreHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityScoreHistory();
    }
    /**
     * Gets the compliantRequirementsCount property value. The number of compliant security requirements at the time.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCompliantRequirementsCount() {
        return this.backingStore.get("compliantRequirementsCount");
    }
    /**
     * Gets the createdDateTime property value. The date the history entry was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantRequirementsCount", (n) -> { this.setCompliantRequirementsCount(n.getLongValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getFloatValue()); });
        deserializerMap.put("totalRequirementsCount", (n) -> { this.setTotalRequirementsCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the score property value. The score recorded at the time.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getScore() {
        return this.backingStore.get("score");
    }
    /**
     * Gets the totalRequirementsCount property value. The total number of requirements at the time.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalRequirementsCount() {
        return this.backingStore.get("totalRequirementsCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("compliantRequirementsCount", this.getCompliantRequirementsCount());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeFloatValue("score", this.getScore());
        writer.writeLongValue("totalRequirementsCount", this.getTotalRequirementsCount());
    }
    /**
     * Sets the compliantRequirementsCount property value. The number of compliant security requirements at the time.
     * @param value Value to set for the compliantRequirementsCount property.
     */
    public void setCompliantRequirementsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("compliantRequirementsCount", value);
    }
    /**
     * Sets the createdDateTime property value. The date the history entry was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the score property value. The score recorded at the time.
     * @param value Value to set for the score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("score", value);
    }
    /**
     * Sets the totalRequirementsCount property value. The total number of requirements at the time.
     * @param value Value to set for the totalRequirementsCount property.
     */
    public void setTotalRequirementsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalRequirementsCount", value);
    }
}
