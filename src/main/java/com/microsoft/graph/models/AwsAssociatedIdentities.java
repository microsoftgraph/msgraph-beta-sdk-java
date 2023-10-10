package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsAssociatedIdentities implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The all property
     */
    private java.util.List<AwsIdentity> all;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The roles property
     */
    private java.util.List<AwsRole> roles;
    /**
     * The users property
     */
    private java.util.List<AwsUser> users;
    /**
     * Instantiates a new AwsAssociatedIdentities and sets the default values.
     */
    public AwsAssociatedIdentities() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsAssociatedIdentities
     */
    @jakarta.annotation.Nonnull
    public static AwsAssociatedIdentities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsAssociatedIdentities();
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
     * @return a java.util.List<AwsIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsIdentity> getAll() {
        return this.all;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("all", (n) -> { this.setAll(n.getCollectionOfObjectValues(AwsIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfObjectValues(AwsRole::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(AwsUser::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the roles property value. The roles property
     * @return a java.util.List<AwsRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsRole> getRoles() {
        return this.roles;
    }
    /**
     * Gets the users property value. The users property
     * @return a java.util.List<AwsUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsUser> getUsers() {
        return this.users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("all", this.getAll());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("roles", this.getRoles());
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
    public void setAll(@jakarta.annotation.Nullable final java.util.List<AwsIdentity> value) {
        this.all = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<AwsRole> value) {
        this.roles = value;
    }
    /**
     * Sets the users property value. The users property
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<AwsUser> value) {
        this.users = value;
    }
}
