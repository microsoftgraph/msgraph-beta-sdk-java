package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessClientApplications implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ConditionalAccessClientApplications} and sets the default values.
     */
    public ConditionalAccessClientApplications() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionalAccessClientApplications}
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessClientApplications createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessClientApplications();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the agentIdServicePrincipalFilter property value. Filter that defines rules based on custom security attribute tags to include/exclude agent identities in the policy.
     * @return a {@link ConditionalAccessFilter}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessFilter getAgentIdServicePrincipalFilter() {
        return this.backingStore.get("agentIdServicePrincipalFilter");
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
     * Gets the excludeAgentIdServicePrincipals property value. Agent identity object IDs excluded from the policy.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeAgentIdServicePrincipals() {
        return this.backingStore.get("excludeAgentIdServicePrincipals");
    }
    /**
     * Gets the excludeServicePrincipals property value. Service principal IDs excluded from the policy scope.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeServicePrincipals() {
        return this.backingStore.get("excludeServicePrincipals");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("agentIdServicePrincipalFilter", (n) -> { this.setAgentIdServicePrincipalFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeAgentIdServicePrincipals", (n) -> { this.setExcludeAgentIdServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeServicePrincipals", (n) -> { this.setExcludeServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeAgentIdServicePrincipals", (n) -> { this.setIncludeAgentIdServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeServicePrincipals", (n) -> { this.setIncludeServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("servicePrincipalFilter", (n) -> { this.setServicePrincipalFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeAgentIdServicePrincipals property value. Agent identity object IDs included in the policy.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeAgentIdServicePrincipals() {
        return this.backingStore.get("includeAgentIdServicePrincipals");
    }
    /**
     * Gets the includeServicePrincipals property value. Service principal IDs included in the policy scope or ServicePrincipalsInMyTenant.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeServicePrincipals() {
        return this.backingStore.get("includeServicePrincipals");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the servicePrincipalFilter property value. Filter that defines the dynamic-servicePrincipal-syntax rule to include/exclude service principals. A filter can use custom security attributes to include/exclude service principals.
     * @return a {@link ConditionalAccessFilter}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessFilter getServicePrincipalFilter() {
        return this.backingStore.get("servicePrincipalFilter");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("agentIdServicePrincipalFilter", this.getAgentIdServicePrincipalFilter());
        writer.writeCollectionOfPrimitiveValues("excludeAgentIdServicePrincipals", this.getExcludeAgentIdServicePrincipals());
        writer.writeCollectionOfPrimitiveValues("excludeServicePrincipals", this.getExcludeServicePrincipals());
        writer.writeCollectionOfPrimitiveValues("includeAgentIdServicePrincipals", this.getIncludeAgentIdServicePrincipals());
        writer.writeCollectionOfPrimitiveValues("includeServicePrincipals", this.getIncludeServicePrincipals());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("servicePrincipalFilter", this.getServicePrincipalFilter());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the agentIdServicePrincipalFilter property value. Filter that defines rules based on custom security attribute tags to include/exclude agent identities in the policy.
     * @param value Value to set for the agentIdServicePrincipalFilter property.
     */
    public void setAgentIdServicePrincipalFilter(@jakarta.annotation.Nullable final ConditionalAccessFilter value) {
        this.backingStore.set("agentIdServicePrincipalFilter", value);
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
     * Sets the excludeAgentIdServicePrincipals property value. Agent identity object IDs excluded from the policy.
     * @param value Value to set for the excludeAgentIdServicePrincipals property.
     */
    public void setExcludeAgentIdServicePrincipals(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeAgentIdServicePrincipals", value);
    }
    /**
     * Sets the excludeServicePrincipals property value. Service principal IDs excluded from the policy scope.
     * @param value Value to set for the excludeServicePrincipals property.
     */
    public void setExcludeServicePrincipals(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeServicePrincipals", value);
    }
    /**
     * Sets the includeAgentIdServicePrincipals property value. Agent identity object IDs included in the policy.
     * @param value Value to set for the includeAgentIdServicePrincipals property.
     */
    public void setIncludeAgentIdServicePrincipals(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeAgentIdServicePrincipals", value);
    }
    /**
     * Sets the includeServicePrincipals property value. Service principal IDs included in the policy scope or ServicePrincipalsInMyTenant.
     * @param value Value to set for the includeServicePrincipals property.
     */
    public void setIncludeServicePrincipals(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeServicePrincipals", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the servicePrincipalFilter property value. Filter that defines the dynamic-servicePrincipal-syntax rule to include/exclude service principals. A filter can use custom security attributes to include/exclude service principals.
     * @param value Value to set for the servicePrincipalFilter property.
     */
    public void setServicePrincipalFilter(@jakarta.annotation.Nullable final ConditionalAccessFilter value) {
        this.backingStore.set("servicePrincipalFilter", value);
    }
}
