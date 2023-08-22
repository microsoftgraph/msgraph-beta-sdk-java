package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BranchConnectivityConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The branchId property
     */
    private String branchId;
    /**
     * The branchName property
     */
    private String branchName;
    /**
     * The links property
     */
    private java.util.List<ConnectivityConfigurationLink> links;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new branchConnectivityConfiguration and sets the default values.
     */
    public BranchConnectivityConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a branchConnectivityConfiguration
     */
    @jakarta.annotation.Nonnull
    public static BranchConnectivityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BranchConnectivityConfiguration();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the branchId property value. The branchId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBranchId() {
        return this.branchId;
    }
    /**
     * Gets the branchName property value. The branchName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBranchName() {
        return this.branchName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("branchId", (n) -> { this.setBranchId(n.getStringValue()); });
        deserializerMap.put("branchName", (n) -> { this.setBranchName(n.getStringValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(ConnectivityConfigurationLink::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the links property value. The links property
     * @return a connectivityConfigurationLink
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectivityConfigurationLink> getLinks() {
        return this.links;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("branchId", this.getBranchId());
        writer.writeStringValue("branchName", this.getBranchName());
        writer.writeCollectionOfObjectValues("links", this.getLinks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the branchId property value. The branchId property
     * @param value Value to set for the branchId property.
     */
    public void setBranchId(@jakarta.annotation.Nullable final String value) {
        this.branchId = value;
    }
    /**
     * Sets the branchName property value. The branchName property
     * @param value Value to set for the branchName property.
     */
    public void setBranchName(@jakarta.annotation.Nullable final String value) {
        this.branchName = value;
    }
    /**
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final java.util.List<ConnectivityConfigurationLink> value) {
        this.links = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
