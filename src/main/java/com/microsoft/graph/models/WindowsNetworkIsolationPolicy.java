package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Network Isolation Policy */
public class WindowsNetworkIsolationPolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Contains a list of enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy. This collection can contain a maximum of 500 elements. */
    private java.util.List<ProxiedDomain> _enterpriseCloudResources;
    /** This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseCloudResources policy to force traffic to the matched cloud resources through these proxies. */
    private java.util.List<String> _enterpriseInternalProxyServers;
    /** Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to. This collection can contain a maximum of 500 elements. */
    private java.util.List<IpRange> _enterpriseIPRanges;
    /** Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false. */
    private Boolean _enterpriseIPRangesAreAuthoritative;
    /** This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected. These locations will be considered a safe destination for enterprise data to be shared to. */
    private java.util.List<String> _enterpriseNetworkDomainNames;
    /** This is a list of proxy servers. Any server not on this list is considered non-enterprise. */
    private java.util.List<String> _enterpriseProxyServers;
    /** Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false */
    private Boolean _enterpriseProxyServersAreAuthoritative;
    /** List of domain names that can used for work or personal resource. */
    private java.util.List<String> _neutralDomainResources;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new windowsNetworkIsolationPolicy and sets the default values.
     * @return a void
     */
    public WindowsNetworkIsolationPolicy() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsNetworkIsolationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsNetworkIsolationPolicy
     */
    @javax.annotation.Nonnull
    public static WindowsNetworkIsolationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsNetworkIsolationPolicy();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the enterpriseCloudResources property value. Contains a list of enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy. This collection can contain a maximum of 500 elements.
     * @return a proxiedDomain
     */
    @javax.annotation.Nullable
    public java.util.List<ProxiedDomain> getEnterpriseCloudResources() {
        return this._enterpriseCloudResources;
    }
    /**
     * Gets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseCloudResources policy to force traffic to the matched cloud resources through these proxies.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnterpriseInternalProxyServers() {
        return this._enterpriseInternalProxyServers;
    }
    /**
     * Gets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to. This collection can contain a maximum of 500 elements.
     * @return a ipRange
     */
    @javax.annotation.Nullable
    public java.util.List<IpRange> getEnterpriseIPRanges() {
        return this._enterpriseIPRanges;
    }
    /**
     * Gets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnterpriseIPRangesAreAuthoritative() {
        return this._enterpriseIPRangesAreAuthoritative;
    }
    /**
     * Gets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected. These locations will be considered a safe destination for enterprise data to be shared to.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnterpriseNetworkDomainNames() {
        return this._enterpriseNetworkDomainNames;
    }
    /**
     * Gets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnterpriseProxyServers() {
        return this._enterpriseProxyServers;
    }
    /**
     * Gets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnterpriseProxyServersAreAuthoritative() {
        return this._enterpriseProxyServersAreAuthoritative;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsNetworkIsolationPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(9) {{
            this.put("enterpriseCloudResources", (n) -> { currentObject.setEnterpriseCloudResources(n.getCollectionOfObjectValues(ProxiedDomain::createFromDiscriminatorValue)); });
            this.put("enterpriseInternalProxyServers", (n) -> { currentObject.setEnterpriseInternalProxyServers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("enterpriseIPRanges", (n) -> { currentObject.setEnterpriseIPRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
            this.put("enterpriseIPRangesAreAuthoritative", (n) -> { currentObject.setEnterpriseIPRangesAreAuthoritative(n.getBooleanValue()); });
            this.put("enterpriseNetworkDomainNames", (n) -> { currentObject.setEnterpriseNetworkDomainNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("enterpriseProxyServers", (n) -> { currentObject.setEnterpriseProxyServers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("enterpriseProxyServersAreAuthoritative", (n) -> { currentObject.setEnterpriseProxyServersAreAuthoritative(n.getBooleanValue()); });
            this.put("neutralDomainResources", (n) -> { currentObject.setNeutralDomainResources(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the neutralDomainResources property value. List of domain names that can used for work or personal resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNeutralDomainResources() {
        return this._neutralDomainResources;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the enterpriseCloudResources property value. Contains a list of enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the enterpriseCloudResources property.
     * @return a void
     */
    public void setEnterpriseCloudResources(@javax.annotation.Nullable final java.util.List<ProxiedDomain> value) {
        this._enterpriseCloudResources = value;
    }
    /**
     * Sets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseCloudResources policy to force traffic to the matched cloud resources through these proxies.
     * @param value Value to set for the enterpriseInternalProxyServers property.
     * @return a void
     */
    public void setEnterpriseInternalProxyServers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enterpriseInternalProxyServers = value;
    }
    /**
     * Sets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the enterpriseIPRanges property.
     * @return a void
     */
    public void setEnterpriseIPRanges(@javax.annotation.Nullable final java.util.List<IpRange> value) {
        this._enterpriseIPRanges = value;
    }
    /**
     * Sets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false.
     * @param value Value to set for the enterpriseIPRangesAreAuthoritative property.
     * @return a void
     */
    public void setEnterpriseIPRangesAreAuthoritative(@javax.annotation.Nullable final Boolean value) {
        this._enterpriseIPRangesAreAuthoritative = value;
    }
    /**
     * Sets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected. These locations will be considered a safe destination for enterprise data to be shared to.
     * @param value Value to set for the enterpriseNetworkDomainNames property.
     * @return a void
     */
    public void setEnterpriseNetworkDomainNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enterpriseNetworkDomainNames = value;
    }
    /**
     * Sets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise.
     * @param value Value to set for the enterpriseProxyServers property.
     * @return a void
     */
    public void setEnterpriseProxyServers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enterpriseProxyServers = value;
    }
    /**
     * Sets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @param value Value to set for the enterpriseProxyServersAreAuthoritative property.
     * @return a void
     */
    public void setEnterpriseProxyServersAreAuthoritative(@javax.annotation.Nullable final Boolean value) {
        this._enterpriseProxyServersAreAuthoritative = value;
    }
    /**
     * Sets the neutralDomainResources property value. List of domain names that can used for work or personal resource.
     * @param value Value to set for the neutralDomainResources property.
     * @return a void
     */
    public void setNeutralDomainResources(@javax.annotation.Nullable final java.util.List<String> value) {
        this._neutralDomainResources = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
