package in.co.payroll.mgt.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import in.co.payroll.mgt.dto.RoleDTO;
import in.co.payroll.mgt.exception.DuplicateRecordException;



/**Role Service Interface
 * @author Navigable Set
 *@version 1.0
 *@copywrite Navigable Set
 */


public interface RoleServiceInt {


	/**
     * Add a role
     * 
     * @param dto
     * 
     * @throws DuplicateRecordException
     *             : throws when role already exists
     */
	
	
	public long add(RoleDTO dto) throws DuplicateRecordException;
	/**
     * Delete a role
     * 
     * @param dto
     
     */
	public void delete(RoleDTO dto) ;
	/**
     * Update a Role
     * 
     * @param dto
     
     * @throws DuplicateRecordException
     *             : if updated role record is already exist
     */
	public void update(RoleDTO dto) throws DuplicateRecordException;
	   /**
     * Find role by PK
     * 
     * @param pk
     *            : get parameter
     * @return dto
     *
     */
	public RoleDTO findByPK(long pk) ;
	
	
	/**
     * Find Role by Name
     * 
     * @param name
     *            : get parameter
     * @return dto
     * 
     */
	public RoleDTO findByName(String name);
	
	
	 
	 /**
    * Search Roles
    * 
    * @return list : List of Roles
    * @param dto
    *            : Search Parameters
    *
    */
	public List<RoleDTO> search(RoleDTO dto);
	 /**
    * Search Roles with pagination
    * 
    * @return list : List of Roles
    * @param dto
    *            : Search Parameters
    * @param pageNo
    *            : Current Page No.
    * @param pageSize
    *            : Size of Page
    * 
    */
	public List search(RoleDTO dto, int pageNo, int pageSize) ;
	
	/**
	 * Get map of id v/s it's dto, key is id and value is dto
	 * 
	 * @param ids
	 * @return Map
	 */
	public Map<Long, RoleDTO> getMapDTO(Set<Long> ids);
	
	
	
}
