package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleSuccessStatistics implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The permanentFail property */
    private Long _permanentFail;
    /** The permanentSuccess property */
    private Long _permanentSuccess;
    /** The removeFail property */
    private Long _removeFail;
    /** The removeSuccess property */
    private Long _removeSuccess;
    /** The roleId property */
    private String _roleId;
    /** The roleName property */
    private String _roleName;
    /** The temporaryFail property */
    private Long _temporaryFail;
    /** The temporarySuccess property */
    private Long _temporarySuccess;
    /** The unknownFail property */
    private Long _unknownFail;
    /**
     * Instantiates a new roleSuccessStatistics and sets the default values.
     * @return a void
     */
    public RoleSuccessStatistics() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.roleSuccessStatistics");
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RoleSuccessStatistics currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(10) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("permanentFail", (n) -> { currentObject.setPermanentFail(n.getLongValue()); });
            this.put("permanentSuccess", (n) -> { currentObject.setPermanentSuccess(n.getLongValue()); });
            this.put("removeFail", (n) -> { currentObject.setRemoveFail(n.getLongValue()); });
            this.put("removeSuccess", (n) -> { currentObject.setRemoveSuccess(n.getLongValue()); });
            this.put("roleId", (n) -> { currentObject.setRoleId(n.getStringValue()); });
            this.put("roleName", (n) -> { currentObject.setRoleName(n.getStringValue()); });
            this.put("temporaryFail", (n) -> { currentObject.setTemporaryFail(n.getLongValue()); });
            this.put("temporarySuccess", (n) -> { currentObject.setTemporarySuccess(n.getLongValue()); });
            this.put("unknownFail", (n) -> { currentObject.setUnknownFail(n.getLongValue()); });
        }};
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
     * Gets the permanentFail property value. The permanentFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPermanentFail() {
        return this._permanentFail;
    }
    /**
     * Gets the permanentSuccess property value. The permanentSuccess property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPermanentSuccess() {
        return this._permanentSuccess;
    }
    /**
     * Gets the removeFail property value. The removeFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getRemoveFail() {
        return this._removeFail;
    }
    /**
     * Gets the removeSuccess property value. The removeSuccess property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getRemoveSuccess() {
        return this._removeSuccess;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this._roleId;
    }
    /**
     * Gets the roleName property value. The roleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleName() {
        return this._roleName;
    }
    /**
     * Gets the temporaryFail property value. The temporaryFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTemporaryFail() {
        return this._temporaryFail;
    }
    /**
     * Gets the temporarySuccess property value. The temporarySuccess property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTemporarySuccess() {
        return this._temporarySuccess;
    }
    /**
     * Gets the unknownFail property value. The unknownFail property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnknownFail() {
        return this._unknownFail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the permanentFail property value. The permanentFail property
     * @param value Value to set for the permanentFail property.
     * @return a void
     */
    public void setPermanentFail(@javax.annotation.Nullable final Long value) {
        this._permanentFail = value;
    }
    /**
     * Sets the permanentSuccess property value. The permanentSuccess property
     * @param value Value to set for the permanentSuccess property.
     * @return a void
     */
    public void setPermanentSuccess(@javax.annotation.Nullable final Long value) {
        this._permanentSuccess = value;
    }
    /**
     * Sets the removeFail property value. The removeFail property
     * @param value Value to set for the removeFail property.
     * @return a void
     */
    public void setRemoveFail(@javax.annotation.Nullable final Long value) {
        this._removeFail = value;
    }
    /**
     * Sets the removeSuccess property value. The removeSuccess property
     * @param value Value to set for the removeSuccess property.
     * @return a void
     */
    public void setRemoveSuccess(@javax.annotation.Nullable final Long value) {
        this._removeSuccess = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     * @return a void
     */
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this._roleId = value;
    }
    /**
     * Sets the roleName property value. The roleName property
     * @param value Value to set for the roleName property.
     * @return a void
     */
    public void setRoleName(@javax.annotation.Nullable final String value) {
        this._roleName = value;
    }
    /**
     * Sets the temporaryFail property value. The temporaryFail property
     * @param value Value to set for the temporaryFail property.
     * @return a void
     */
    public void setTemporaryFail(@javax.annotation.Nullable final Long value) {
        this._temporaryFail = value;
    }
    /**
     * Sets the temporarySuccess property value. The temporarySuccess property
     * @param value Value to set for the temporarySuccess property.
     * @return a void
     */
    public void setTemporarySuccess(@javax.annotation.Nullable final Long value) {
        this._temporarySuccess = value;
    }
    /**
     * Sets the unknownFail property value. The unknownFail property
     * @param value Value to set for the unknownFail property.
     * @return a void
     */
    public void setUnknownFail(@javax.annotation.Nullable final Long value) {
        this._unknownFail = value;
    }
}
