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
/**
 * Windows Network Isolation Policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsNetworkIsolationPolicy implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsNetworkIsolationPolicy} and sets the default values.
     */
    public WindowsNetworkIsolationPolicy() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsNetworkIsolationPolicy}
     */
    @jakarta.annotation.Nonnull
    public static WindowsNetworkIsolationPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsNetworkIsolationPolicy();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the enterpriseCloudResources property value. Contains a list of enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<ProxiedDomain>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProxiedDomain> getEnterpriseCloudResources() {
        return this.backingStore.get("enterpriseCloudResources");
    }
    /**
     * Gets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, &apos;157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59&apos;. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseCloudResources policy to force traffic to the matched cloud resources through these proxies.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnterpriseInternalProxyServers() {
        return this.backingStore.get("enterpriseInternalProxyServers");
    }
    /**
     * Gets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<IpRange>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpRange> getEnterpriseIPRanges() {
        return this.backingStore.get("enterpriseIPRanges");
    }
    /**
     * Gets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseIPRangesAreAuthoritative() {
        return this.backingStore.get("enterpriseIPRangesAreAuthoritative");
    }
    /**
     * Gets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected. These locations will be considered a safe destination for enterprise data to be shared to.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnterpriseNetworkDomainNames() {
        return this.backingStore.get("enterpriseNetworkDomainNames");
    }
    /**
     * Gets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnterpriseProxyServers() {
        return this.backingStore.get("enterpriseProxyServers");
    }
    /**
     * Gets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseProxyServersAreAuthoritative() {
        return this.backingStore.get("enterpriseProxyServersAreAuthoritative");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("enterpriseCloudResources", (n) -> { this.setEnterpriseCloudResources(n.getCollectionOfObjectValues(ProxiedDomain::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseInternalProxyServers", (n) -> { this.setEnterpriseInternalProxyServers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enterpriseIPRanges", (n) -> { this.setEnterpriseIPRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseIPRangesAreAuthoritative", (n) -> { this.setEnterpriseIPRangesAreAuthoritative(n.getBooleanValue()); });
        deserializerMap.put("enterpriseNetworkDomainNames", (n) -> { this.setEnterpriseNetworkDomainNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enterpriseProxyServers", (n) -> { this.setEnterpriseProxyServers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enterpriseProxyServersAreAuthoritative", (n) -> { this.setEnterpriseProxyServersAreAuthoritative(n.getBooleanValue()); });
        deserializerMap.put("neutralDomainResources", (n) -> { this.setNeutralDomainResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the neutralDomainResources property value. List of domain names that can used for work or personal resource.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNeutralDomainResources() {
        return this.backingStore.get("neutralDomainResources");
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
        writer.writeCollectionOfObjectValues("enterpriseCloudResources", this.getEnterpriseCloudResources());
        writer.writeCollectionOfPrimitiveValues("enterpriseInternalProxyServers", this.getEnterpriseInternalProxyServers());
        writer.writeCollectionOfObjectValues("enterpriseIPRanges", this.getEnterpriseIPRanges());
        writer.writeBooleanValue("enterpriseIPRangesAreAuthoritative", this.getEnterpriseIPRangesAreAuthoritative());
        writer.writeCollectionOfPrimitiveValues("enterpriseNetworkDomainNames", this.getEnterpriseNetworkDomainNames());
        writer.writeCollectionOfPrimitiveValues("enterpriseProxyServers", this.getEnterpriseProxyServers());
        writer.writeBooleanValue("enterpriseProxyServersAreAuthoritative", this.getEnterpriseProxyServersAreAuthoritative());
        writer.writeCollectionOfPrimitiveValues("neutralDomainResources", this.getNeutralDomainResources());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the enterpriseCloudResources property value. Contains a list of enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the enterpriseCloudResources property.
     */
    public void setEnterpriseCloudResources(@jakarta.annotation.Nullable final java.util.List<ProxiedDomain> value) {
        this.backingStore.set("enterpriseCloudResources", value);
    }
    /**
     * Sets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, &apos;157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59&apos;. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseCloudResources policy to force traffic to the matched cloud resources through these proxies.
     * @param value Value to set for the enterpriseInternalProxyServers property.
     */
    public void setEnterpriseInternalProxyServers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enterpriseInternalProxyServers", value);
    }
    /**
     * Sets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the enterpriseIPRanges property.
     */
    public void setEnterpriseIPRanges(@jakarta.annotation.Nullable final java.util.List<IpRange> value) {
        this.backingStore.set("enterpriseIPRanges", value);
    }
    /**
     * Sets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false.
     * @param value Value to set for the enterpriseIPRangesAreAuthoritative property.
     */
    public void setEnterpriseIPRangesAreAuthoritative(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enterpriseIPRangesAreAuthoritative", value);
    }
    /**
     * Sets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected. These locations will be considered a safe destination for enterprise data to be shared to.
     * @param value Value to set for the enterpriseNetworkDomainNames property.
     */
    public void setEnterpriseNetworkDomainNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enterpriseNetworkDomainNames", value);
    }
    /**
     * Sets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise.
     * @param value Value to set for the enterpriseProxyServers property.
     */
    public void setEnterpriseProxyServers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enterpriseProxyServers", value);
    }
    /**
     * Sets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @param value Value to set for the enterpriseProxyServersAreAuthoritative property.
     */
    public void setEnterpriseProxyServersAreAuthoritative(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enterpriseProxyServersAreAuthoritative", value);
    }
    /**
     * Sets the neutralDomainResources property value. List of domain names that can used for work or personal resource.
     * @param value Value to set for the neutralDomainResources property.
     */
    public void setNeutralDomainResources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("neutralDomainResources", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
