package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeGraphInsights extends Entity implements Parsable {
    /** Access this property from the derived type itemInsights. */
    private java.util.List<SharedInsight> shared;
    /** Access this property from the derived type itemInsights. */
    private java.util.List<Trending> trending;
    /** Access this property from the derived type itemInsights. */
    private java.util.List<UsedInsight> used;
    /**
     * Instantiates a new officeGraphInsights and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeGraphInsights() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeGraphInsights
     */
    @javax.annotation.Nonnull
    public static OfficeGraphInsights createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.itemInsights": return new ItemInsights();
            }
        }
        return new OfficeGraphInsights();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("shared", (n) -> { this.setShared(n.getCollectionOfObjectValues(SharedInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("trending", (n) -> { this.setTrending(n.getCollectionOfObjectValues(Trending::createFromDiscriminatorValue)); });
        deserializerMap.put("used", (n) -> { this.setUsed(n.getCollectionOfObjectValues(UsedInsight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shared property value. Access this property from the derived type itemInsights.
     * @return a sharedInsight
     */
    @javax.annotation.Nullable
    public java.util.List<SharedInsight> getShared() {
        return this.shared;
    }
    /**
     * Gets the trending property value. Access this property from the derived type itemInsights.
     * @return a trending
     */
    @javax.annotation.Nullable
    public java.util.List<Trending> getTrending() {
        return this.trending;
    }
    /**
     * Gets the used property value. Access this property from the derived type itemInsights.
     * @return a usedInsight
     */
    @javax.annotation.Nullable
    public java.util.List<UsedInsight> getUsed() {
        return this.used;
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
        writer.writeCollectionOfObjectValues("shared", this.getShared());
        writer.writeCollectionOfObjectValues("trending", this.getTrending());
        writer.writeCollectionOfObjectValues("used", this.getUsed());
    }
    /**
     * Sets the shared property value. Access this property from the derived type itemInsights.
     * @param value Value to set for the shared property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShared(@javax.annotation.Nullable final java.util.List<SharedInsight> value) {
        this.shared = value;
    }
    /**
     * Sets the trending property value. Access this property from the derived type itemInsights.
     * @param value Value to set for the trending property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrending(@javax.annotation.Nullable final java.util.List<Trending> value) {
        this.trending = value;
    }
    /**
     * Sets the used property value. Access this property from the derived type itemInsights.
     * @param value Value to set for the used property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsed(@javax.annotation.Nullable final java.util.List<UsedInsight> value) {
        this.used = value;
    }
}
