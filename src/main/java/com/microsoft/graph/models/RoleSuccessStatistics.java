package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleSuccessStatistics implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The permanentFail property
     */
    private Long permanentFail;
    /**
     * The permanentSuccess property
     */
    private Long permanentSuccess;
    /**
     * The removeFail property
     */
    private Long removeFail;
    /**
     * The removeSuccess property
     */
    private Long removeSuccess;
    /**
     * The roleId property
     */
    private String roleId;
    /**
     * The roleName property
     */
    private String roleName;
    /**
     * The temporaryFail property
     */
    private Long temporaryFail;
    /**
     * The temporarySuccess property
     */
    private Long temporarySuccess;
    /**
     * The unknownFail property
     */
    private Long unknownFail;
    /**
     * Instantiates a new roleSuccessStatistics and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleSuccessStatistics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roleSuccessStatistics
     */
    @javax.annotation.Nonnull
    public static RoleSuccessStatistics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleSuccessStatistics();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permanentFail", (n) -> { this.setPermanentFail(n.getLongValue()); });
        deserializerMap.put("permanentSuccess", (n) -> { this.setPermanentSuccess(n.getLongValue()); });
        deserializerMap.put("removeFail", (n) -> { this.setRemoveFail(n.getLongValue()); });
        deserializerMap.put("removeSuccess", (n) -> { this.setRemoveSuccess(n.getLongValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleName", (n) -> { this.setRoleName(n.getStringValue()); });
        deserializerMap.put("temporaryFail", (n) -> { this.setTemporaryFail(n.getLongValue()); });
        deserializerMap.put("temporarySuccess", (n) -> { this.setTemporarySuccess(n.getLongValue()); });
        deserializerMap.put("unknownFail", (n) -> { this.setUnknownFail(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the permanentFail property value. The permanentFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPermanentFail() {
        return this.permanentFail;
    }
    /**
     * Gets the permanentSuccess property value. The permanentSuccess property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPermanentSuccess() {
        return this.permanentSuccess;
    }
    /**
     * Gets the removeFail property value. The removeFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getRemoveFail() {
        return this.removeFail;
    }
    /**
     * Gets the removeSuccess property value. The removeSuccess property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getRemoveSuccess() {
        return this.removeSuccess;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleName property value. The roleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleName() {
        return this.roleName;
    }
    /**
     * Gets the temporaryFail property value. The temporaryFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTemporaryFail() {
        return this.temporaryFail;
    }
    /**
     * Gets the temporarySuccess property value. The temporarySuccess property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTemporarySuccess() {
        return this.temporarySuccess;
    }
    /**
     * Gets the unknownFail property value. The unknownFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnknownFail() {
        return this.unknownFail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("permanentFail", this.getPermanentFail());
        writer.writeLongValue("permanentSuccess", this.getPermanentSuccess());
        writer.writeLongValue("removeFail", this.getRemoveFail());
        writer.writeLongValue("removeSuccess", this.getRemoveSuccess());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeStringValue("roleName", this.getRoleName());
        writer.writeLongValue("temporaryFail", this.getTemporaryFail());
        writer.writeLongValue("temporarySuccess", this.getTemporarySuccess());
        writer.writeLongValue("unknownFail", this.getUnknownFail());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the permanentFail property value. The permanentFail property
     * @param value Value to set for the permanentFail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermanentFail(@javax.annotation.Nullable final Long value) {
        this.permanentFail = value;
    }
    /**
     * Sets the permanentSuccess property value. The permanentSuccess property
     * @param value Value to set for the permanentSuccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermanentSuccess(@javax.annotation.Nullable final Long value) {
        this.permanentSuccess = value;
    }
    /**
     * Sets the removeFail property value. The removeFail property
     * @param value Value to set for the removeFail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveFail(@javax.annotation.Nullable final Long value) {
        this.removeFail = value;
    }
    /**
     * Sets the removeSuccess property value. The removeSuccess property
     * @param value Value to set for the removeSuccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveSuccess(@javax.annotation.Nullable final Long value) {
        this.removeSuccess = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleName property value. The roleName property
     * @param value Value to set for the roleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleName(@javax.annotation.Nullable final String value) {
        this.roleName = value;
    }
    /**
     * Sets the temporaryFail property value. The temporaryFail property
     * @param value Value to set for the temporaryFail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemporaryFail(@javax.annotation.Nullable final Long value) {
        this.temporaryFail = value;
    }
    /**
     * Sets the temporarySuccess property value. The temporarySuccess property
     * @param value Value to set for the temporarySuccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemporarySuccess(@javax.annotation.Nullable final Long value) {
        this.temporarySuccess = value;
    }
    /**
     * Sets the unknownFail property value. The unknownFail property
     * @param value Value to set for the unknownFail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownFail(@javax.annotation.Nullable final Long value) {
        this.unknownFail = value;
    }
}
