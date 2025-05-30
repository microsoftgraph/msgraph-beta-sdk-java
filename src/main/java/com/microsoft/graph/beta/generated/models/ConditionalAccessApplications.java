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
public class ConditionalAccessApplications implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ConditionalAccessApplications} and sets the default values.
     */
    public ConditionalAccessApplications() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionalAccessApplications}
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessApplications createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessApplications();
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
     * Gets the applicationFilter property value. Filter that defines the dynamic-application-syntax rule to include/exclude cloud applications. A filter can use custom security attributes to include/exclude applications.
     * @return a {@link ConditionalAccessFilter}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessFilter getApplicationFilter() {
        return this.backingStore.get("applicationFilter");
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
     * Gets the excludeApplications property value. Can be one of the following:  The list of client IDs (appId) explicitly excluded from the policy. Office365 - For the list of apps included in Office365, see Apps included in Conditional Access Office 365 app suite  MicrosoftAdminPortals - For more information, see Conditional Access Target resources: Microsoft Admin Portals
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeApplications() {
        return this.backingStore.get("excludeApplications");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("applicationFilter", (n) -> { this.setApplicationFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeApplications", (n) -> { this.setExcludeApplications(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("globalSecureAccess", (n) -> { this.setGlobalSecureAccess(n.getObjectValue(ConditionalAccessGlobalSecureAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("includeApplications", (n) -> { this.setIncludeApplications(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeAuthenticationContextClassReferences", (n) -> { this.setIncludeAuthenticationContextClassReferences(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeUserActions", (n) -> { this.setIncludeUserActions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("networkAccess", (n) -> { this.setNetworkAccess(n.getObjectValue(ConditionalAccessNetworkAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the globalSecureAccess property value. Represents traffic profile for Global Secure Access. This property is deprecated and will stop returning data on June 1, 2025. Use new Global Secure Access applications instead.
     * @return a {@link ConditionalAccessGlobalSecureAccess}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessGlobalSecureAccess getGlobalSecureAccess() {
        return this.backingStore.get("globalSecureAccess");
    }
    /**
     * Gets the includeApplications property value. Can be one of the following:  The list of client IDs (appId) the policy applies to, unless explicitly excluded (in excludeApplications)  All  Office365 - For the list of apps included in Office365, see Apps included in Conditional Access Office 365 app suite  MicrosoftAdminPortals - For more information, see Conditional Access Target resources: Microsoft Admin Portals
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeApplications() {
        return this.backingStore.get("includeApplications");
    }
    /**
     * Gets the includeAuthenticationContextClassReferences property value. Authentication context class references include. Supported values are c1 through c25.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeAuthenticationContextClassReferences() {
        return this.backingStore.get("includeAuthenticationContextClassReferences");
    }
    /**
     * Gets the includeUserActions property value. User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeUserActions() {
        return this.backingStore.get("includeUserActions");
    }
    /**
     * Gets the networkAccess property value. Represents traffic profile for Global Secure Access. This property is deprecated and will stop returning data on June 1, 2025. Use new Global Secure Access applications instead.
     * @return a {@link ConditionalAccessNetworkAccess}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessNetworkAccess getNetworkAccess() {
        return this.backingStore.get("networkAccess");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("applicationFilter", this.getApplicationFilter());
        writer.writeCollectionOfPrimitiveValues("excludeApplications", this.getExcludeApplications());
        writer.writeObjectValue("globalSecureAccess", this.getGlobalSecureAccess());
        writer.writeCollectionOfPrimitiveValues("includeApplications", this.getIncludeApplications());
        writer.writeCollectionOfPrimitiveValues("includeAuthenticationContextClassReferences", this.getIncludeAuthenticationContextClassReferences());
        writer.writeCollectionOfPrimitiveValues("includeUserActions", this.getIncludeUserActions());
        writer.writeObjectValue("networkAccess", this.getNetworkAccess());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the applicationFilter property value. Filter that defines the dynamic-application-syntax rule to include/exclude cloud applications. A filter can use custom security attributes to include/exclude applications.
     * @param value Value to set for the applicationFilter property.
     */
    public void setApplicationFilter(@jakarta.annotation.Nullable final ConditionalAccessFilter value) {
        this.backingStore.set("applicationFilter", value);
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
     * Sets the excludeApplications property value. Can be one of the following:  The list of client IDs (appId) explicitly excluded from the policy. Office365 - For the list of apps included in Office365, see Apps included in Conditional Access Office 365 app suite  MicrosoftAdminPortals - For more information, see Conditional Access Target resources: Microsoft Admin Portals
     * @param value Value to set for the excludeApplications property.
     */
    public void setExcludeApplications(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeApplications", value);
    }
    /**
     * Sets the globalSecureAccess property value. Represents traffic profile for Global Secure Access. This property is deprecated and will stop returning data on June 1, 2025. Use new Global Secure Access applications instead.
     * @param value Value to set for the globalSecureAccess property.
     */
    public void setGlobalSecureAccess(@jakarta.annotation.Nullable final ConditionalAccessGlobalSecureAccess value) {
        this.backingStore.set("globalSecureAccess", value);
    }
    /**
     * Sets the includeApplications property value. Can be one of the following:  The list of client IDs (appId) the policy applies to, unless explicitly excluded (in excludeApplications)  All  Office365 - For the list of apps included in Office365, see Apps included in Conditional Access Office 365 app suite  MicrosoftAdminPortals - For more information, see Conditional Access Target resources: Microsoft Admin Portals
     * @param value Value to set for the includeApplications property.
     */
    public void setIncludeApplications(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeApplications", value);
    }
    /**
     * Sets the includeAuthenticationContextClassReferences property value. Authentication context class references include. Supported values are c1 through c25.
     * @param value Value to set for the includeAuthenticationContextClassReferences property.
     */
    public void setIncludeAuthenticationContextClassReferences(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeAuthenticationContextClassReferences", value);
    }
    /**
     * Sets the includeUserActions property value. User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     * @param value Value to set for the includeUserActions property.
     */
    public void setIncludeUserActions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeUserActions", value);
    }
    /**
     * Sets the networkAccess property value. Represents traffic profile for Global Secure Access. This property is deprecated and will stop returning data on June 1, 2025. Use new Global Secure Access applications instead.
     * @param value Value to set for the networkAccess property.
     */
    public void setNetworkAccess(@jakarta.annotation.Nullable final ConditionalAccessNetworkAccess value) {
        this.backingStore.set("networkAccess", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
