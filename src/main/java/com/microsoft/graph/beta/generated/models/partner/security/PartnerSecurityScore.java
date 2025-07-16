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
public class PartnerSecurityScore extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PartnerSecurityScore} and sets the default values.
     */
    public PartnerSecurityScore() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PartnerSecurityScore}
     */
    @jakarta.annotation.Nonnull
    public static PartnerSecurityScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PartnerSecurityScore();
    }
    /**
     * Gets the currentScore property value. The current security score for the partner.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getCurrentScore() {
        return this.backingStore.get("currentScore");
    }
    /**
     * Gets the customerInsights property value. Contains customer-specific information for certain requirements.
     * @return a {@link java.util.List<CustomerInsight>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerInsight> getCustomerInsights() {
        return this.backingStore.get("customerInsights");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("currentScore", (n) -> { this.setCurrentScore(n.getFloatValue()); });
        deserializerMap.put("customerInsights", (n) -> { this.setCustomerInsights(n.getCollectionOfObjectValues(CustomerInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(SecurityScoreHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("lastRefreshDateTime", (n) -> { this.setLastRefreshDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("maxScore", (n) -> { this.setMaxScore(n.getFloatValue()); });
        deserializerMap.put("requirements", (n) -> { this.setRequirements(n.getCollectionOfObjectValues(SecurityRequirement::createFromDiscriminatorValue)); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. Contains a list of recent score changes.
     * @return a {@link java.util.List<SecurityScoreHistory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityScoreHistory> getHistory() {
        return this.backingStore.get("history");
    }
    /**
     * Gets the lastRefreshDateTime property value. The last time the data was checked.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshDateTime() {
        return this.backingStore.get("lastRefreshDateTime");
    }
    /**
     * Gets the maxScore property value. The maximum score possible.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getMaxScore() {
        return this.backingStore.get("maxScore");
    }
    /**
     * Gets the requirements property value. Contains the list of security requirements that make up the score.
     * @return a {@link java.util.List<SecurityRequirement>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityRequirement> getRequirements() {
        return this.backingStore.get("requirements");
    }
    /**
     * Gets the updatedDateTime property value. The last time the security score or related properties changed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this.backingStore.get("updatedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeFloatValue("currentScore", this.getCurrentScore());
        writer.writeCollectionOfObjectValues("customerInsights", this.getCustomerInsights());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeOffsetDateTimeValue("lastRefreshDateTime", this.getLastRefreshDateTime());
        writer.writeFloatValue("maxScore", this.getMaxScore());
        writer.writeCollectionOfObjectValues("requirements", this.getRequirements());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
    }
    /**
     * Sets the currentScore property value. The current security score for the partner.
     * @param value Value to set for the currentScore property.
     */
    public void setCurrentScore(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("currentScore", value);
    }
    /**
     * Sets the customerInsights property value. Contains customer-specific information for certain requirements.
     * @param value Value to set for the customerInsights property.
     */
    public void setCustomerInsights(@jakarta.annotation.Nullable final java.util.List<CustomerInsight> value) {
        this.backingStore.set("customerInsights", value);
    }
    /**
     * Sets the history property value. Contains a list of recent score changes.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<SecurityScoreHistory> value) {
        this.backingStore.set("history", value);
    }
    /**
     * Sets the lastRefreshDateTime property value. The last time the data was checked.
     * @param value Value to set for the lastRefreshDateTime property.
     */
    public void setLastRefreshDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshDateTime", value);
    }
    /**
     * Sets the maxScore property value. The maximum score possible.
     * @param value Value to set for the maxScore property.
     */
    public void setMaxScore(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("maxScore", value);
    }
    /**
     * Sets the requirements property value. Contains the list of security requirements that make up the score.
     * @param value Value to set for the requirements property.
     */
    public void setRequirements(@jakarta.annotation.Nullable final java.util.List<SecurityRequirement> value) {
        this.backingStore.set("requirements", value);
    }
    /**
     * Sets the updatedDateTime property value. The last time the security score or related properties changed.
     * @param value Value to set for the updatedDateTime property.
     */
    public void setUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("updatedDateTime", value);
    }
}
