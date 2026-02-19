package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Zone extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Zone} and sets the default values.
     */
    public Zone() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Zone}
     */
    @jakarta.annotation.Nonnull
    public static Zone createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Zone();
    }
    /**
     * Gets the aggregations property value. Environment count summaries by type. Read-only. Supports $filter (eq) on the kind property. For example, $filter=aggregations/any(a: a/kind eq &apos;azureSubscription&apos;).
     * @return a {@link java.util.List<AggregatedEnvironment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AggregatedEnvironment> getAggregations() {
        return this.backingStore.get("aggregations");
    }
    /**
     * Gets the created property value. Creation metadata, including user and timestamp. Supports $orderby (dateTime property only). Supports $filter (ge, le, gt, lt) on the dateTime property. For example, $filter=created/dateTime ge 2023-01-01T00:00:00Z.
     * @return a {@link AuditInfo}
     */
    @jakarta.annotation.Nullable
    public AuditInfo getCreated() {
        return this.backingStore.get("created");
    }
    /**
     * Gets the description property value. Optional description of the zone. Up to 255 characters. Supports $filter (eq, contains). For example, $filter=contains(description, &apos;production&apos;).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Human-readable name of the zone. Up to 1,024 characters. Supports $filter (eq, contains), and $orderby. For example, $filter=displayName eq &apos;Production Zone&apos; or $orderby=displayName asc.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the environments property value. Collection of attached environments. Supports $expand.
     * @return a {@link java.util.List<Environment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Environment> getEnvironments() {
        return this.backingStore.get("environments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aggregations", (n) -> { this.setAggregations(n.getCollectionOfObjectValues(AggregatedEnvironment::createFromDiscriminatorValue)); });
        deserializerMap.put("created", (n) -> { this.setCreated(n.getObjectValue(AuditInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("environments", (n) -> { this.setEnvironments(n.getCollectionOfObjectValues(Environment::createFromDiscriminatorValue)); });
        deserializerMap.put("modified", (n) -> { this.setModified(n.getObjectValue(AuditInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modified property value. Last modification metadata, including user and timestamp. Supports $orderby (dateTime property only). Supports $filter (ge, le, gt, lt) on the dateTime property. For example, $orderby=modified/dateTime desc.
     * @return a {@link AuditInfo}
     */
    @jakarta.annotation.Nullable
    public AuditInfo getModified() {
        return this.backingStore.get("modified");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("aggregations", this.getAggregations());
        writer.writeObjectValue("created", this.getCreated());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("environments", this.getEnvironments());
        writer.writeObjectValue("modified", this.getModified());
    }
    /**
     * Sets the aggregations property value. Environment count summaries by type. Read-only. Supports $filter (eq) on the kind property. For example, $filter=aggregations/any(a: a/kind eq &apos;azureSubscription&apos;).
     * @param value Value to set for the aggregations property.
     */
    public void setAggregations(@jakarta.annotation.Nullable final java.util.List<AggregatedEnvironment> value) {
        this.backingStore.set("aggregations", value);
    }
    /**
     * Sets the created property value. Creation metadata, including user and timestamp. Supports $orderby (dateTime property only). Supports $filter (ge, le, gt, lt) on the dateTime property. For example, $filter=created/dateTime ge 2023-01-01T00:00:00Z.
     * @param value Value to set for the created property.
     */
    public void setCreated(@jakarta.annotation.Nullable final AuditInfo value) {
        this.backingStore.set("created", value);
    }
    /**
     * Sets the description property value. Optional description of the zone. Up to 255 characters. Supports $filter (eq, contains). For example, $filter=contains(description, &apos;production&apos;).
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Human-readable name of the zone. Up to 1,024 characters. Supports $filter (eq, contains), and $orderby. For example, $filter=displayName eq &apos;Production Zone&apos; or $orderby=displayName asc.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the environments property value. Collection of attached environments. Supports $expand.
     * @param value Value to set for the environments property.
     */
    public void setEnvironments(@jakarta.annotation.Nullable final java.util.List<Environment> value) {
        this.backingStore.set("environments", value);
    }
    /**
     * Sets the modified property value. Last modification metadata, including user and timestamp. Supports $orderby (dateTime property only). Supports $filter (ge, le, gt, lt) on the dateTime property. For example, $orderby=modified/dateTime desc.
     * @param value Value to set for the modified property.
     */
    public void setModified(@jakarta.annotation.Nullable final AuditInfo value) {
        this.backingStore.set("modified", value);
    }
}
