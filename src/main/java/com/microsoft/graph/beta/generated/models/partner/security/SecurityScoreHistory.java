package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.graph.beta.models.ReferenceNumeric;
import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
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
        deserializerMap.put("score", (n) -> { this.setScore(n.getObjectValue(SecurityScoreHistoryScore::createFromDiscriminatorValue)); });
        deserializerMap.put("totalRequirementsCount", (n) -> { this.setTotalRequirementsCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the score property value. The score recorded at the time.
     * @return a {@link SecurityScoreHistoryScore}
     */
    @jakarta.annotation.Nullable
    public SecurityScoreHistoryScore getScore() {
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
        writer.writeObjectValue("score", this.getScore());
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
    public void setScore(@jakarta.annotation.Nullable final SecurityScoreHistoryScore value) {
        this.backingStore.set("score", value);
    }
    /**
     * Sets the totalRequirementsCount property value. The total number of requirements at the time.
     * @param value Value to set for the totalRequirementsCount property.
     */
    public void setTotalRequirementsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalRequirementsCount", value);
    }
    /**
     * Composed type wrapper for classes {@link Float}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class SecurityScoreHistoryScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link SecurityScoreHistoryScore} and sets the default values.
         */
        public SecurityScoreHistoryScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link SecurityScoreHistoryScore}
         */
        @jakarta.annotation.Nonnull
        public static SecurityScoreHistoryScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final SecurityScoreHistoryScore result = new SecurityScoreHistoryScore();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getFloatValue() != null) {
                result.setFloat(parseNode.getFloatValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the float property value. Composed type representation for type {@link Float}
         * @return a {@link Float}
         */
        @jakarta.annotation.Nullable
        public Float getFloat() {
            return this.backingStore.get("float");
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getFloat() != null) {
                writer.writeFloatValue(null, this.getFloat());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the float property value. Composed type representation for type {@link Float}
         * @param value Value to set for the float property.
         */
        public void setFloat(@jakarta.annotation.Nullable final Float value) {
            this.backingStore.set("float", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
}
