package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewReviewerScope extends AccessReviewScope implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewReviewerScope} and sets the default values.
     */
    public AccessReviewReviewerScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewReviewerScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewReviewerScope}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewReviewerScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewReviewerScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("queryRoot", (n) -> { this.setQueryRoot(n.getStringValue()); });
        deserializerMap.put("queryType", (n) -> { this.setQueryType(n.getStringValue()); });
        deserializerMap.put("reviewerId", (n) -> { this.setReviewerId(n.getStringValue()); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getEnumValue(AccessReviewReviewerScopeType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the query property value. The query specifying who will be the reviewer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.backingStore.get("query");
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQueryRoot() {
        return this.backingStore.get("queryRoot");
    }
    /**
     * Gets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQueryType() {
        return this.backingStore.get("queryType");
    }
    /**
     * Gets the reviewerId property value. The reviewerId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReviewerId() {
        return this.backingStore.get("reviewerId");
    }
    /**
     * Gets the scopeType property value. The scopeType property
     * @return a {@link AccessReviewReviewerScopeType}
     */
    @jakarta.annotation.Nullable
    public AccessReviewReviewerScopeType getScopeType() {
        return this.backingStore.get("scopeType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("queryRoot", this.getQueryRoot());
        writer.writeStringValue("queryType", this.getQueryType());
        writer.writeStringValue("reviewerId", this.getReviewerId());
        writer.writeEnumValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the query property value. The query specifying who will be the reviewer.
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("query", value);
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @param value Value to set for the queryRoot property.
     */
    public void setQueryRoot(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryRoot", value);
    }
    /**
     * Sets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @param value Value to set for the queryType property.
     */
    public void setQueryType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryType", value);
    }
    /**
     * Sets the reviewerId property value. The reviewerId property
     * @param value Value to set for the reviewerId property.
     */
    public void setReviewerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewerId", value);
    }
    /**
     * Sets the scopeType property value. The scopeType property
     * @param value Value to set for the scopeType property.
     */
    public void setScopeType(@jakarta.annotation.Nullable final AccessReviewReviewerScopeType value) {
        this.backingStore.set("scopeType", value);
    }
}
