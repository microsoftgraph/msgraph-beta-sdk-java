package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureAssociatedIdentities implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The all property
     */
    private java.util.List<AzureIdentity> all;
    /**
     * The managedIdentities property
     */
    private java.util.List<AzureManagedIdentity> managedIdentities;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The servicePrincipals property
     */
    private java.util.List<AzureServicePrincipal> servicePrincipals;
    /**
     * The users property
     */
    private java.util.List<AzureUser> users;
    /**
     * Instantiates a new AzureAssociatedIdentities and sets the default values.
     */
    public AzureAssociatedIdentities() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureAssociatedIdentities
     */
    @jakarta.annotation.Nonnull
    public static AzureAssociatedIdentities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureAssociatedIdentities();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the all property value. The all property
     * @return a java.util.List<AzureIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureIdentity> getAll() {
        return this.all;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("all", (n) -> { this.setAll(n.getCollectionOfObjectValues(AzureIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("managedIdentities", (n) -> { this.setManagedIdentities(n.getCollectionOfObjectValues(AzureManagedIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("servicePrincipals", (n) -> { this.setServicePrincipals(n.getCollectionOfObjectValues(AzureServicePrincipal::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(AzureUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managedIdentities property value. The managedIdentities property
     * @return a java.util.List<AzureManagedIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureManagedIdentity> getManagedIdentities() {
        return this.managedIdentities;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the servicePrincipals property value. The servicePrincipals property
     * @return a java.util.List<AzureServicePrincipal>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureServicePrincipal> getServicePrincipals() {
        return this.servicePrincipals;
    }
    /**
     * Gets the users property value. The users property
     * @return a java.util.List<AzureUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureUser> getUsers() {
        return this.users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("all", this.getAll());
        writer.writeCollectionOfObjectValues("managedIdentities", this.getManagedIdentities());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("servicePrincipals", this.getServicePrincipals());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the all property value. The all property
     * @param value Value to set for the all property.
     */
    public void setAll(@jakarta.annotation.Nullable final java.util.List<AzureIdentity> value) {
        this.all = value;
    }
    /**
     * Sets the managedIdentities property value. The managedIdentities property
     * @param value Value to set for the managedIdentities property.
     */
    public void setManagedIdentities(@jakarta.annotation.Nullable final java.util.List<AzureManagedIdentity> value) {
        this.managedIdentities = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the servicePrincipals property value. The servicePrincipals property
     * @param value Value to set for the servicePrincipals property.
     */
    public void setServicePrincipals(@jakarta.annotation.Nullable final java.util.List<AzureServicePrincipal> value) {
        this.servicePrincipals = value;
    }
    /**
     * Sets the users property value. The users property
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<AzureUser> value) {
        this.users = value;
    }
}
